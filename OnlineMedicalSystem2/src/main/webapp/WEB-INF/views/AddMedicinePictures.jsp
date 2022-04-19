<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<style>
body {
	background-image: url("./css/image4.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
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
	<form action="savemedicine" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<div class="bg-info">
	<h1 class=" text-center text-white" style="font-weight: bold ;text-transform: uppercase">Add Medicine Picture</h1>
	</div>
			<label class="col-md-4 control-label" for="filebutton">Medicine
				Image</label>
			<!-- <div class="col-md-4">
				<input id="filebutton" name="image" class="input-file" type="file">
				<input type="submit" class="btn btn-outline-success">
</div> -->
</div>
<div class=container></div>
	<div class="card mx-auto mt-5 bg-primary" style="width: 50%;opacity: 80%">
		<div class="card-body py-5">
			<h3 class="text-center text-white" style="text-transform: uppercase">Add </h3>
			<div class="col-md-4">
				<input id="filebutton" name="image" class="input-file btn btn-secondary btn-lg btn btn-dark" type="file">
				<input type="submit" class="btn btn-success">
</div>
			
</div>
</div>
				<!-- <label for="formFileLg" class="form-label">Upload</label>
<input class="form-control form-control-lg" id="formFileLg" type="file" />
  </div>
</div> -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
	</form>
</body>
</html>