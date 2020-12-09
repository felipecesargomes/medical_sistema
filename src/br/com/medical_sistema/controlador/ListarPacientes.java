package br.com.medical_sistema.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.dao.PacienteDao;
import br.com.medical_sistema.model.Paciente;

public class ListarPacientes implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PacienteDao pDao = new PacienteDao();
		List<Paciente> lista = new ArrayList<>();
		lista = pDao.listarPacientes();
		System.out.println(lista);
		
		request.setAttribute("list", lista);
		return "foward:listapacientes.jsp";
	}

}
