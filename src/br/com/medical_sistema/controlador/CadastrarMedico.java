package br.com.medical_sistema.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.dao.MedicoDao;
import br.com.medical_sistema.model.Medico;

public class CadastrarMedico implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String crm = request.getParameter("crm");
		String situacao = request.getParameter("situacao");
		Medico med = new Medico();
		med.setNome(nome);
		med.setCrm(crm);
		med.setSituacao(situacao);
		MedicoDao mDao = new MedicoDao();
		
		mDao.cadastrarMedico(med);
		return "forward:cadastrado.jsp";
	}

}
