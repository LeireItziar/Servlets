package com.ipartek.ejemplos.leire.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productoscrud")
public class ProductosCRUDServlet extends HttpServlet {
	static final String RUTA_LISTADO = "/WEB-INF/vistas/productoscrud.jsp";

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		ServletContext application = request.getServletContext();
		//		ProductosDAL prod = (ProductosDAL) application.getAttribute("prod");
		request.getRequestDispatcher(RUTA_LISTADO).forward(request, response);
	}

}
