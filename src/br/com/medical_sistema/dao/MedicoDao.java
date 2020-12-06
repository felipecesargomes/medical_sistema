package br.com.medical_sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.medical_sistema.controlador.FactoryManager;
import br.com.medical_sistema.model.Medico;

public class MedicoDao {

	Connection conn = FactoryManager.pegarConexao();
	List<Medico> listaMedicos = new ArrayList<Medico>();
	
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
	
	public List<Medico> listarMedicos() {
		try {
			String listarMedicos = "SELECT * FROM T_MEDICO";
			PreparedStatement stmt = conn.prepareStatement(listarMedicos);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Medico m2 = new Medico();
				m2.setId(rs.getLong("id_medico"));
				m2.setNome(rs.getString("nome"));
				m2.setCrm(rs.getString("crm"));
				m2.setSituacao(rs.getString("situacao"));
				listaMedicos.add(m2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMedicos;
	}
	
}