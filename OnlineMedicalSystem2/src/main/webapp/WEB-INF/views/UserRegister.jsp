<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

</head>
<body>
<script language="JavaScript" src="js/validation.js">
</script>
	<div class="container">
	<frm:form action="save" modelAttribute="user"   onsubmit="return validate(this)" method="POST">
		<!-- <form class="form-horizontal" role="form" name="user" action="save"
			method="POST"> -->
			<h2>Add</h2>
			<div>
				<a href="dashboard">Home</a>
			</div>
			<div class="form-group">
				<label for="firstName" class="col-sm-3 control-label">First
					Name</label>
				<div class="col-sm-9">
					<input type="text" name="firstName" id="firstName"
						placeholder="First Name" class="form-control" autofocus>
						<frm:errors  cssClass="text-danger" path="firstName"/> <span  id="usernameId"></span> </td>
				</div>
			</div>
			<div class="form-group">
				<label for="lastName" class="col-sm-3 control-label">Last
					Name</label>
				<div class="col-sm-9">
					<input type="text" name="lastName" id="lastName"
						placeholder="Last Name" class="form-control" autofocus>
						<frm:errors  cssClass="text-danger" path="lastName"/> <span  id="usernameId"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-3 control-label">Email* </label>
				<div class="col-sm-9">
					<input type="email" name="email" id="email" placeholder="Email"
						class="form-control" name="email">
					<frm:errors  cssClass="text-danger" path="email"/> <span  id="useremailId"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-3 control-label">Password*</label>
				<div class="col-sm-9">
					<input type="password" name="password" id="password"
						placeholder="Password" class="form-control">
						<frm:errors  cssClass="text-danger" path="password"/> <span  id="password"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-3 control-label">Confirm
					Password*</label>
				<div class="col-sm-9">
					<input type="password" id="password" placeholder="Password"
						class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label for="birthDate" class="col-sm-3 control-label">Date
					of Birth*</label>
				<div class="col-sm-9">
					<input type="text" name="date" id="birthDate" class="form-control"
						placeholder="dd/mm/yyyy">
						<frm:errors  cssClass="text-danger" path="date"/> <span  id="date"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="phoneNumber" class="col-sm-3 control-label">Phone
					number </label>
				<div class="col-sm-9">
					<input type="text" name="phoneNumber" id="phoneNumber"
						placeholder="Phone number" class="form-control"> <span
						class="help-block">Your phone number won't be disclosed
						anywhere </span>
						<frm:errors  cssClass="text-danger" path="phoneNumber"/> <span  id="phoneNumber"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="Address" class="col-sm-3 control-label">Address
				</label>
				<div class="col-sm-9">
					<textarea class="form-control z-depth-1" name="address"
						id="exampleFormControlTextarea6" rows="3"
						placeholder="Write something here..."></textarea>
						<frm:errors  cssClass="text-danger" path="address"/> <span  id="address"></span> 
				</div>
			</div>
			<div class="form-group">
				<label for="weight" class="col-sm-3 control-label">role </label>
				<div class="col-sm-9">
					<input type="text" name="role" id="role"
						placeholder="Please enter role of user" class="form-control">
						<frm:errors  cssClass="text-danger" path="role"/> <span  id="UserroleId"></span> 
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-3">Gender</label>
				<div class="col-sm-6">
					<div class="row">
						<div class="col-sm-4">
							<label class="radio-inline"> <input type="radio"
								name="gender" id="femaleRadio" value="Female">Female
							</label>
						</div>
						<div class="col-sm-4">
							<label class="radio-inline"> <input type="radio"
							name="gender"	id="maleRadio" value="Male">Male
							</label>
						</div>
						<frm:errors  cssClass="text-danger" path="gender"/> <span  id="gender"></span>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<span class="help-block">*Required fields</span>
				</div>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Add</button>
		</form>
		</frm:form>
		<div>
			<h2>${msg}</h2>
		</div>
	</div>
</body>
</html>

