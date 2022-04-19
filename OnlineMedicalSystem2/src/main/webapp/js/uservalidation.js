function  validate(frm){
	alert("js");
	let username=frm.username.value;
	let useremail=frm.useremail.value;
	let userrole=frm.role.value;
	let flag=true;
	  
	//empty the error messages
	document.getElementById("userenameId").innerHTML="";
	document.getElementById("useremailId").innerHTML="";
	document.getElementById("UserroleId").innerHTML="";
	
		  frm.vflag.value="yes";
		  alert(frm.vflag.value);
	
	if( username==""){
		flag=false;
		document.getElementById("userenameId").innerHTML="User name is mandatory(js)";
	}
	else if(userename.length<5 || userename.length>10){
		flag=false;
		document.getElementById("userenameId").innerHTML="Employee name must have min of 5 chars and max of 10 chars (js)";
	}
	
	if(useremail==""){
		flag=false;
		document.getElementById("useremailId").innerHTML="User email is mandatory(js)";
	}
	else if(useremail.length<5 || useremail.length>9){
		flag=false;
		document.getElementById("useremailId").innerHTML="UserEmail must have min of 5 chars and max of 9 chars (js)";
	}
	
	if(userrole==""){
		flag=false;
		document.getElementById("userroleId").innerHTML="User role is mandatory(js)";
	}
	else if(userrole.length<5 ||userrole.length>9){
		flag=false;
		document.getElementById("userroleId").innerHTML="User rolemust have min of 5 chars and max of 9 chars (js)";
	}
	/*else if(sal<10000 || sal>100000){
		flag=false;
		document.getElementById("salId").innerHTML="Employee salary must be in the range between 10000 to 100000(js)";
		
	}
	*/
	return flag;
}