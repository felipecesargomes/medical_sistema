package br.com.medical_sistema.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryManager {

	private static String user = "postgres";
	private static String password = "root";
	private static String url = "jdbc:postgresql://localhost:5432/medical";
	private static Connection conn = null;

	public FactoryManager() {
		FactoryManager.pegarConexao();
	}

	public static Connection pegarConexao() {
		if (conn == null) {
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, user, password);
				conn.setAutoCommit(false);
				System.out.println("Conexão realizada com sucesso!");
			} catch (ClassNotFoundException e) {
				System.out.println("Classe não encontrada!");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Não foi possível conectar - Verifique a conexão novamente!");
				e.printStackTrace();
			}
		}
		return conn;
	}

}
