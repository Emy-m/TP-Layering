package ar.unrn.tp3.bd;

public class PersistenciaException extends RuntimeException {
	public PersistenciaException() {
		super("No se puedo persistir");
	}
	
	public PersistenciaException(String descripcion) {
		super("No se puedo persistir: " + descripcion);
	}
}
