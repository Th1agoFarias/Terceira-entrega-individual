<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Java - Lista de Clientes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">MVC-CRUD</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Listas de clientes</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Destino.html">Cadastro de Destino</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="DestinoCreateAndFind">Listas de destinos</a>
        </li>
        
      </ul>
      <form action="CreateAndFind" method="get" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o Nome ou CPF" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>	
 <div class="container">
 	<div class="row">
 		<div class="cold-md-7">
 			<hr>
 				<h3>Destinos Cadastrados </h3>
 			<hr>
 			 <table class="table">
 				<thead>
 					<tr>
 						<th>#</th>
 						<th>Estado</th>
 						<th>Cidade</th>					
 						<th>Ida</th>
 						<th>Volta</th>
 					</tr>
 				</thead>
 				<tbody>
 			   			<c:forEach items="${destinos}" var="destino">
							<tr>
								<td>${destino.id}</td>
								<td>${destino.estado}</td>
								<td>${destino.cidade}</td>
								<td>${destino.ida}</td>
								<td>${destino.volta}</td>
								<td>
									<a href="Delete?clienteId=${cliente.id}">deletar</a> |
									<a href="FindAndUpdate?clienteId=${cliente.id}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
 				</tbody>
 			</table>
 			<h5><a href="index.html">Voltar para o Cadastro de clientes</a></h5>
 		</div>
 	</div>
 </div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>