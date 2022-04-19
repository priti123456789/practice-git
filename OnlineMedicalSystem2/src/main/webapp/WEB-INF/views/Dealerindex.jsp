
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
body {
	background-image: url("./css/image1.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	   background-size: 100% 100%;  
}
</style>

</head>

<body>
<nav class="navbar navbar-expand-lg navbar-fixed -top  navbar-dark bg-dark">
  <a class="navbar-brand" href="#" style="font-weight: bold ;text-transform: uppercase">Online Medical Portal</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
    
      <li class="nav-item">
        <a class="nav-link  text-white" style="font-weight: bold" href="displaySignOutPage">Sign Out</a>
      </li>
     
   
    </ul>
   
  </div>
</nav>

	<div class="container mt-3">

		<div class="bg-info">
	<h1 class=" text-center text-white" style="font-weight: bold ;text-transform: uppercase">Welcome To Dealer Dashboard</h1>
	</div>
		<div class="row">

			<div class="col-md-12">

				<%-- 		<h1 class="text-center mb-3">Add Product</h1>
 <h3>  product are ::${products}</h3>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
                 
						<c:forEach items="${products }" var="p">
							<tr>
								<th scope="row">MEDICINE${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td class="font-weight-bold">&#x20B9; ${p.price }</td>
								<td>
								<a href="delete/${p.id }"><i class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								<a href="update/${p.id }"><i class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>
							
								
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
 --%>
				<div class="container text-center">

					<a href="add-product" class="btn btn-outline-success btn btn-success">Add
						Product</a>

				</div>

				<!-- <div  class="container text-center"> -->
				<a href="getAllDealerProducts" class="btn btn-warning"
					class="text-center text-white">DealerAllProducts</a>
			</div>
		</div>


	</div>

	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>
