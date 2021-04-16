package ar.unrn.tp3.modelo;

public class Participante {
	private String nombre;
	private Telefono telefono;
	private Region region;
	
	public Participante(String nombre, String telefono, String region) throws DatosInvalidosParticipanteException {
		if (esNulo(nombre) || stringVacio(nombre)) {
			throw new DatosInvalidosParticipanteException("Nombre vacio");
		}
		
		this.nombre = nombre;
		this.region = new Region(region);
		this.telefono = new Telefono(telefono);
	}

	private boolean stringVacio(String string) {
		return string.isEmpty();
	}

	private boolean esNulo(String string) {
		return string == null;
	}
	
	public String devolverNombre() {
		return nombre;
	}
	
	public String devolverTelefono() {
		return telefono.obtenerTelefono();
	}
	
	public String devolverRegion() {
		return region.obtenerRegion();
	}
}
