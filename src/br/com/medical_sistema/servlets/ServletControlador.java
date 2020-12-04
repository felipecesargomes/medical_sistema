package br.com.medical_sistema.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.medical_sistema.controlador.Acao;

@WebServlet("/entrada")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String nameClass = "br.com.medical_sistema.controlador." + acao;
		String name = null;
		try {
			Class classe = Class.forName(nameClass);
			Acao action = (Acao) classe.newInstance();
			name = action.executar(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
		String[] link = name.split(":");
		if(link[0].equals("redirect")) {
			response.sendRedirect(link[1]);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/" + link[1]);
			rd.forward(request, response);
		}
		
	}

}
