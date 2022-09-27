package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DestinoDao;

public class AgenciaDestinoDelete {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int destinoId = Integer.parseInt(request.getParameter("destinoId"));
		DestinoDao.delete(destinoId);
		
		AgenciaDestinoCreateAndFind agenciaDestinoCreateAndFind  = new  AgenciaDestinoCreateAndFind ();
		agenciaDestinoCreateAndFind .doGet(request, response);
	}

}
