package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DestinoDao;
import model.Destino;

/**
 * Servlet implementation class AgenciaDestinoCreateAndFind
 */
@WebServlet("/DestinoCreateAndFind")
public class AgenciaDestinoCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgenciaDestinoCreateAndFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Destino> destinos = DestinoDao.find(pesquisa);
		
		request.setAttribute("destinos", destinos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("DestinoList.jsp");
		resquesDispatcher.forward(request, response);
	}

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Destino destino = new Destino();
		
		destino.setEstado(request.getParameter("estado"));
		destino.setCidade(request.getParameter("cidade"));
		destino.setIda(request.getParameter("ida"));
		destino.setVolta(request.getParameter("volta"));
	
		
		DestinoDao.create(destino);
		
		doGet(request, response);
		
	}
}
