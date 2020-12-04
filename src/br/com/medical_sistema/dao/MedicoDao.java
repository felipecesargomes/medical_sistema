package br.com.medical_sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.medical_sistema.controlador.FactoryManager;
import br.com.medical_sistema.model.Medico;

public class MedicoDao {

	Connection conn = FactoryManager.pegarConexao();
	
	public void cadastrarMedico(Medico m) {
		String inserirMedico = "INSERT INTO T_MEDICO (NOME,CRM,SITUACAO) VALUES (?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(inserirMedico);
			stmt.setString(1, m.getNome());
			stmt.setString(2, m.getCrm());
			stmt.setString(3, m.getSituacao());
			stmt.execute();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
