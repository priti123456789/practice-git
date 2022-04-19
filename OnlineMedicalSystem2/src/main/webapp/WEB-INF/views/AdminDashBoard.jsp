<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/styles.css">
<title>Admin DashBoard</title>

<style>
body {
	background-image: url("./css/admin2.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>

</head>
<body>
	
	<!-- <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav"
		role="banner">
		<div class="container">
			<div
				style="background-image: url('./css/styles.css/images/medicines.jpg');"></div>
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".bs-navbar-collapse">
					<span class="sr-only">Admin DashBoard</span> <span class="icon-bar"></span>
					<span class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a href="./" class="navbar-brand" align="center">Welcome Admin
				</a>
				 <li class="nav-item">
      <h3 style="color:red">If not registerd then registerd first</h3>
         <a class="nav-link" href="displaySignOutPage">Sign Out</a> 
        
        
      </li>
			</div>
			<nav
				class="collapse navbar-collapse bs-nav
    
    
    	bar-collapse"
				role="navigation">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Home</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">About <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Mission</a></li>
							<li><a href="#">Vision</a></li>
							<li><a href="#">Careers</a></li>
						</ul></li>
					<li><a href="#">Products</a></li>

					</li>
				</ul>
			</nav>
		</div>
	</header> -->
	
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
	
	<!-- <div>
		<a href="show" class="btn btn-primary" class="text-center text-white">
			Add Customer </a>
	</div>
	<br>
	<div>
		<a href="show" class="btn btn-secondary"
			class="text-center text-white"> Add Dealer</a>
	</div>
	<br>
	<div>
		<a href="addProduct" class="btn btn-success"
			class="text-center text-white"> Add Product </a>
	</div>
	<br>
	<div>
		<a href="showdata" class="btn btn-danger"
			class="text-center text-white">show User Information</a>
	</div>
	<br>
	<div>
		<a href="getAllProduct" class="btn btn-warning"
			class="text-center text-white">show All product</a>
	</div>
	<br>
	<div>
		<a href="searchProductInGoogle" class="btn btn-info"
			class="text-center text-white">searchProduct</a>
	</div>
	<br>
	<div>
		<a href="getAllDealerProducts" class="btn btn-light"
			class="text-center text-white">DealerAllProducts</a>
	</div>
	<br>
	<div>
		<a href="dealerdashboard" class="btn btn-dark"
			class="text-center text-white">DealerDashboar</a>
	</div>
	<br>
	<div>
		<a href="addmedicine" class="btn btn-danger"
			class="text-center text-white">AddMedicinePicture</a>
	</div>
	<br>
	<div>
		<a href="customerCartItem" class="btn btn-danger"
			class="text-center text-white">Customer Cart Item</a>
	</div>
	<br> -->
	<div class="container-fluid">
	<div class="row">
	<div class="col-md-3 " >
	<div class="list-group " >
  <a href="show" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 90%;font-weight:bold">Add Customer</a>
  <a href="show" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 60%;font-weight:bold">Add Dealer</a>
  <a href="addProduct" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 90%;font-weight:bold">Add Product</a>
  <a href="showdata" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 60%;font-weight:bold">Show User Information</a>
  <a href="getAllProductforAdmin" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 90%;font-weight:bold">Show All Product</a>
  <a href="searchProductInGoogle" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 60%;font-weight:bold">Search Product</a>
  <a href="getAllDealerProducts" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 90%;font-weight:bold">Dealer All Product</a>
  <a href="dealerdashboard" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 60%;font-weight:bold">Dealer Dashboard</a>
  <a href="addmedicine" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 90%;font-weight:bold">Add Medicine Picture</a>
  <a href="customerCartItem" class="list-group-item list-group-item-action btn btn-dark bg-info text-light"style="opacity: 60%;font-weight:bold">Customer Cart Item</a>
 
</div>
	</div>
	<div class="col-md-9">
	<div class="bg-info">
	<h1 class=" text-center text-white" style="font-weight: bold ;text-transform: uppercase">Welcome To Admin Dashboard</h1>
	</div>
	<div  >
		<div class="mx-auto mt-5 bg-info " style="opacity:70%" >
			<div class="card-body py-5" >
				<h3 class="text-center text-dark" style="text-transform: uppercase; font-weight:bold">Delete
					User</h3>

				<form action="delete" onsubmit=" return confirmDeatil();">
					<div class="form-group">
						<div class="container text-center">
							<h3 style="color: red" class="text-center ">please enter id
								of user who you want to delete</h3>
							<input type="text" name="id" /> <input type="submit"
								class="btn btn-primary stretched-link"
								class="text-center text-white">
						</div>
					</div>


				</form>


			</div>
		</div>
	</div>
	
	</div>
	</div>
	</div>
	
	
	<!-- for delete -->
	<div class=container></div>
	
	
	
	<script>
function  confirmDeatil(){
	confirm("Are you sure to go delete??");
}

</script>
	<!-- <script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"
		integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script> -->
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>