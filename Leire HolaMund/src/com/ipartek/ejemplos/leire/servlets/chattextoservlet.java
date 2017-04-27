package com.ipartek.ejemplos.leire.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/texto")
public class chattextoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//    public chattextoservlet() {
	//        super();
	//        // TODO Auto-generated constructor stub
	//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String usuariochat = (String) session.getAttribute("usuario");

		String mensajeUsuario = (String) request.getParameter("texto");
		ServletContext application = getServletContext();
		String textochat = (String) application.getAttribute("texto");
		PrintWriter out = response.getWriter();
		if (textochat != null)
			textochat = textochat + usuariochat + " : " + mensajeUsuario + "<br/>";
		else
			textochat = usuariochat + " : " + mensajeUsuario + "<br/>";
		out.println(textochat);
		application.setAttribute("texto", textochat);

		out.println("<form action=texto> <fieldset> <label for=texto>texto</label> <input id=texto name=texto /></fieldset><fieldset><input type=submit value=ENVIAR /></fieldset></form>");

	}

	//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//	}

}
