package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DestinoDao;
import model.Destino;

public class AgenciaDestinoFindAndUpdate {
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	int destinoId = Integer.parseInt(request.getParameter("destinoId"));	
    	Destino destino = DestinoDao.findByPK(destinoId);
    	
    	request.setAttribute("destino", destino);
    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("DestinoList.jsp");
    	requestDispatcher.forward(request, response);
    	}

    	
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    		Destino destino = new Destino();
    		
    		destino.setId(Integer.parseInt(request.getParameter("id")));
    	
    		destino.setEstado(request.getParameter("estado"));
    		destino.setCidade(request.getParameter("cidade"));
    		destino.setIda(request.getParameter("ida"));
    		destino.setVolta(request.getParameter("volta"));
    		
    		
    		DestinoDao.update(destino);
    		
    		AgenciaDestinoCreateAndFind agenciaDestinoCreateAndFind = new  AgenciaDestinoCreateAndFind ();
    		agenciaDestinoCreateAndFind.doGet(request, response);
    	
    	}


}

