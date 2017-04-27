package com.ipartek.ejemplos.leire.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/alta")
public class chataltaservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 
	//    public chataltaservlet() {
	//        super();
	//        // TODO Auto-generated constructor stub
	//    }
	//
	//	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuariochat = request.getParameter("usuario");

		HttpSession session = request.getSession();

		session.setAttribute("usuario", usuariochat);
		PrintWriter out = response.getWriter();
		out.println("Bienvenido " + usuariochat);
		out.println("<br/> <a href =chattexto.html> Texto chat</a>");
	}
	//
	//
	//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//		// TODO Auto-generated method stub
	//	}

}
