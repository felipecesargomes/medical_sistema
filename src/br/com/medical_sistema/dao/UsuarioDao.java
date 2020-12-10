package br.com.medical_sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.medical_sistema.controlador.FactoryManager;
import br.com.medical_sistema.model.Usuario;

public class UsuarioDao {

	private List<Usuario> listaUsuario = new ArrayList<Usuario>();
	Connection conn = FactoryManager.pegarConexao();
	
	public List<Usuario> listarUsuarios() {
		try {
			String listUsuarios = "SELECT * FROM T_USUARIO";
			PreparedStatement stmt = conn.prepareStatement(listUsuarios);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Usuario usr = new Usuario();
				usr.setId(rs.getLong("id_usuario"));
				usr.setLogin(rs.getString("login"));
				usr.setPassword(rs.getString("password"));
				System.out.println(usr.getPassword());
				listaUsuario.add(usr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuario;
	}

	public Usuario buscaUsuario(String user, String senha) {
		for(Usuario u : this.listarUsuarios()) {
			if(u.compareUser(user, senha)) {
				return u;
			}
		} return null;
	}
	
}
