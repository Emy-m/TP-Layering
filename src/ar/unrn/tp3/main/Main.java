package ar.unrn.tp3.main;
import java.awt.EventQueue;
import java.sql.SQLException;

import ar.unrn.tp3.bd.PersistenciaEnBD;
import ar.unrn.tp3.ui.Ventana;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Ventana(new PersistenciaEnBD());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}