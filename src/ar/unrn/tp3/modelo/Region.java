package ar.unrn.tp3.modelo;

public class Region {
	private String region;
	
	public Region(String region) throws DatosInvalidosParticipanteException {
		if (esNulo(region) || stringVacio(region)) {
			throw new DatosInvalidosParticipanteException("Region vacia");
		}
		if (esUnaRegionDesconocida(region)) {
			throw new DatosInvalidosParticipanteException("Region desconocida. Las conocidas son: China, US, Europa");
		}
		
		this.region = region;
	}
	
	private boolean stringVacio(String string) {
		return string.isEmpty();
	}

	private boolean esNulo(String string) {
		return string == null;
	}
	
	private boolean esUnaRegionDesconocida(String region) {
		return !region.equals("China") && !region.equals("US") && !region.equals("Europa");
	}

	public String obtenerRegion() {
		return region;
	}
}
