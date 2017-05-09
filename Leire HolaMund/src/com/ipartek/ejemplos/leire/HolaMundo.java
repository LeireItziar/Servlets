package com.ipartek.ejemplos.leire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

///**
// * Servlet implementation class HolaMundo
// */
//@WebServlet(name = "Saludo", urlPatterns = { "/hola" })
//public class HolaMundo extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public HolaMundo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.setContentType("text/plain");
//		PrintWriter out = response.getWriter();
//		out.println("Hola");
//		out.println(new Date());
//	}
//
//}
import com.ipartek.ejemplos.leire.dal.UsuariosDAL;
import com.ipartek.ejemplos.leire.dal.UsuariosDALUsuarioUnico;
import com.ipartek.ejemplos.leire.tipos.Producto;

@WebServlet(name = "Saludo", urlPatterns = { "/hola" })
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosDAL usuariosDAL = new UsuariosDALUsuarioUnico();

		usuariosDAL.alta(new Producto("javi", "Lete"));

		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		// http://localhost:8080/pruebas/hola?nombre=Javier+Lete
		String nombre = request.getParameter("nombre");
		String pass = request.getParameter("pass");

		Producto usuario = new Producto(nombre, pass);

		if (usuariosDAL.validar(usuario))
			out.println("Bienvenido");
		else
			out.println("Usuario no válido");

		// if (nombre == null || nombre.trim().length() == 0)
		// out.println("Hola desconocido");
		// else if ("javierlete".equals(nombre) && "SuperS3creta".equals(pass))
		// out.println("Bienvenido " + nombre);
		// else
		// out.println("No ha colado el usuario y contraseña");

		// out.println("Hola " + nombre);
		// out.println(new java.util.Date());
	}

}
