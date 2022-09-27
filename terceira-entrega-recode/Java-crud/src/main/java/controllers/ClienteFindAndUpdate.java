package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import model.Cliente;

/**
 * Servlet implementation class ClienteFindAndUpdate
 */
@WebServlet("/FindAndUpdate")
public class ClienteFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteFindAndUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int clinteId = Integer.parseInt(request.getParameter("clienteId"));	
	Cliente cliente = ClienteDao.findByPK(clinteId);
	
	request.setAttribute("cliente", cliente);
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
	requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Cliente cliente = new Cliente();
		
		cliente.setId(Integer.parseInt(request.getParameter("id")));
	
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setNascimento(request.getParameter("nascimento"));
		
		
		
		ClienteDao.update(cliente);
		
		ClienteCreateAndFind clienteCreateAndFind = new  ClienteCreateAndFind ();
		clienteCreateAndFind.doGet(request, response);
	
	}

}
