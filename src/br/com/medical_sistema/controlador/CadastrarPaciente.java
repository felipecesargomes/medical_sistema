package br.com.medical_sistema.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.dao.PacienteDao;
import br.com.medical_sistema.model.Paciente;

public class CadastrarPaciente implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PacienteDao pDao = new PacienteDao();
		Paciente paciente = new Paciente();
		paciente.setNome(request.getParameter("nome"));
		paciente.setConvenio(request.getParameter("convenio"));
		paciente.setCpf(request.getParameter("cpf"));
		pDao.cadastroPaciente(paciente);
		return "foward:cadastrado.jsp";
	}

}
