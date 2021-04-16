package ar.unrn.tp3.modelo;

public class DatosInvalidosParticipanteException extends Exception {
	public DatosInvalidosParticipanteException(String detalle) {
		super("No se pudo crear " + detalle);
	}
}
