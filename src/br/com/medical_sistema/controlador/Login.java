package br.com.medical_sistema.controlador;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.dao.UsuarioDao;
import br.com.medical_sistema.model.Usuario;
import br.com.medical_sistema.security.AES2;

public class Login implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		System.out.println("Login" + user + ' ' + senha);
		UsuarioDao uDao = new UsuarioDao();
		Usuario u = null;
		try {
			u = uDao.buscaUsuario(user, AES2.criptografar(senha, "md5"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(u == null) {
			return "redirect:entrada?acao=LoginForm";
		}
		return "redirect:index.jsp";
	}

}
