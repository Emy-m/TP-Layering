package ar.unrn.tp3.modelo;

import ar.unrn.tp3.bd.PersistenciaException;

public interface CatalogoDeParticipantes {

	void agregarParticipante(String nombre, String telefono, String region) throws PersistenciaException, DatosInvalidosParticipanteException;

}