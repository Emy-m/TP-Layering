package ar.unrn.tp3.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.CatalogoDeParticipantes;
import ar.unrn.tp3.modelo.DatosInvalidosParticipanteException;

public class PersistenciaEnBD implements CatalogoDeParticipantes {

	@Override
	public void agregarParticipante(String nombre, String telefono, String region) throws PersistenciaException, DatosInvalidosParticipanteException {
		Connection conexion = null;
		PreparedStatement st = null;
		
		try {
			conexion = Conexion.conectar();
			st = conexion.prepareStatement("insert into participantes(id_participante, nombre, telefono, region) values(null,?,?,?)");
			
			Participante participante = new Participante(nombre, telefono, region);
			
			st.setString(1, participante.devolverNombre());
			st.setString(2, participante.devolverTelefono());
			st.setString(3, participante.devolverRegion());
			st.executeUpdate();
		} catch (SQLException e) {
			throw new PersistenciaException();
		} finally {
			try {
				st.close();
				conexion.close();
			} catch (Exception exception) {
				throw new PersistenciaException("No se pudo conectar." + exception.getMessage());
			}
		}
	}
	
}
