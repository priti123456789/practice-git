<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
<!-- <form action ="addCart">  -->
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">All Product</h1>
				<%-- <h3>product are ::${product}</h3> --%>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Discount</th>
							<th scope="col">Quantity</th>
							<th scope="col">Stock Alert</th>
							<th scope="col">Stock Critical</th>
							<th scope="col">Price</th>
							
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${product }"  var="p">
							<tr>
								<th scope="row">MEDICINE${p.getProduct_id() }</th>
								<%-- <td>${p.getProduct_Id() }</td> --%>
								<td>${p.getProduct_name()}</td>
								<td>${p.getProduct_desc()}</td>
								<td class="font-weight-bold">&#x20B9; ${p.getPercentage_discount()}</td>
									<td>${p.getProduct_qty()}</td>
								<td>${p.getStock_alert()}</td>
								<td>${p.getStock_critical()}</td>
								<%-- <td>${p.getProduct_price()}</td> --%>
								
								<td class="font-weight-bold">&#x20B9; ${p.getProduct_price() }</td>
								<td><a href="deleteProduct?product_id=${p.getProduct_id()}" class="delete"
									onclick="confirm('are u sure to  delete ${p.getProduct_id()}')"><i
										class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
									<a href="update/${p.getProduct_id() }"><i
										class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>

	 			               
 
								</td>
							</tr>
						</c:forEach>
 				</tbody>
				</table>

				<div class="container text-center">
			<!-- 	<input type="submit" class="btn btn-outline-success" value="Add to cart"> -->
<h3 style="color:red text-align :center">${msg }</h3>
		
						 	<%-- 		<a href="product/${p.getProduct_id()}" class="btn btn-outline-success">Add
						 to cart</a>
 --%>
				</div>


			</div>


		</div>

	</div>
	
	<!-- </form>  -->
</body>
</html>
