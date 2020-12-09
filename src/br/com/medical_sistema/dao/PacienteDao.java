package br.com.medical_sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.medical_sistema.controlador.FactoryManager;
import br.com.medical_sistema.model.Paciente;

public class PacienteDao {

	private Connection conn = FactoryManager.pegarConexao();
	private List<Paciente> lista = new ArrayList<Paciente>();

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

	public List<Paciente> listarPacientes() {
		try {
			String listarPacientes = "SELECT * FROM T_PACIENTE";
			PreparedStatement stmt = conn.prepareStatement(listarPacientes);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Paciente p = new Paciente();
				p.setId(rs.getLong("id_paciente"));
				p.setNome(rs.getString("nome"));
				p.setCpf(rs.getString("cpf"));
				p.setConvenio(rs.getString("convenio"));
				lista.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
