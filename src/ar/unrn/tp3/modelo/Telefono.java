package ar.unrn.tp3.modelo;

public class Telefono {
	private String telefono;
	
	public Telefono(String telefono) throws DatosInvalidosParticipanteException {
		if(esNulo(telefono) || stringVacio(telefono)) {
			throw new DatosInvalidosParticipanteException("Telefono vacio");
		}
		if (!validarTelefono(telefono)) {
			throw new DatosInvalidosParticipanteException("El teléfono debe ingresarse de la siguienteforma: NNNN-NNNNNN");
		}
		
		this.telefono = telefono; 
	}
	
	private boolean stringVacio(String string) {
		return string.isEmpty();
	}

	private boolean esNulo(String string) {
		return string == null;
	}
	
	private boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}
	
	public String obtenerTelefono() {
		return telefono;
	}
}
