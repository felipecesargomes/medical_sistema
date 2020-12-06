package br.com.medical_sistema.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.dao.MedicoDao;

public class ListarMedicos implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MedicoDao mDao = new MedicoDao();
		request.setAttribute("list", mDao.listarMedicos());
		return "foward:listamedicos.jsp";
	}

}
