package br.com.medical_sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.medical_sistema.controlador.FactoryManager;
import br.com.medical_sistema.model.Paciente;

public class PacienteDao {

	private Connection conn = FactoryManager.pegarConexao();
	
	public void cadastroPaciente(Paciente p) {
		try {
			String inserirPaciente = "INSERT INTO T_PACIENTE (NOME,CPF,CONVENIO) VALUES (?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(inserirPaciente);
			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getCpf());
			stmt.setString(3, p.getConvenio());
			stmt.execute();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
