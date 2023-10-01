package com.pablo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pablo.model.Persona;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcesarInformacion
 */
public class ProcesarInformacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesarInformacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> conocimientos = new ArrayList<String>();
		List<String> idiomas = new ArrayList<String>();
		
		String nombre = request.getParameter("Nombre");
		String apellidos = request.getParameter("apellidos");
		String correo = request.getParameter("mail");
		String genero = request.getParameter("genero");
		String comentario = request.getParameter("comentario");
		String java = request.getParameter("java");
		String c = request.getParameter("c");
		String basic = request.getParameter("basic");
		String html = request.getParameter("html");
		
		for(String idioma : request.getParameterValues("idiomas")) {
			idiomas.add(idioma);
		}
		
		if(java != null) {
			conocimientos.add(java);
		}
		if(basic != null) {
			conocimientos.add(basic);
		}
		if(c != null) {
			conocimientos.add(c);
		}
		if(html != null) {
			conocimientos.add(html);
		}
		
		
		Persona persona = new Persona(nombre, apellidos, correo, genero, conocimientos, idiomas, comentario);
		
		request.setAttribute("persona", persona);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/datos.jsp");

		dispatcher.forward(request, response);
	}

}
