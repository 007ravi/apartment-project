<%-- 
    Document   : Signup
  
--%>
<%--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-Up</title>
    
<link rel="icon" href="logo.png" height="30" width="60">
<script>
    function con()
    {
        var x1=document.getElementById("m").value;
        if(x1.length!=10||isNaN(x1))
        {
            alert("Enter valid number");
        }
    }
    </script>
       
		<style>
     	body {background-color:cornsilk;
            font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}
		
		input[type=text], input[type=password],input[type=email],input[type=tel] {
        width: 100%;
        padding: 10px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
}#submit
{
  background-color: grey;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
    opacity: 2.9;
}
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

		</style>
    </head>
    <body>
        <form action="InfoAdd" name="form" method="post" style="border:1px solid #ccc">
    <fieldset>

                 <legend>  <h2>Sign Up</h2> </legend>
            <p>Please fill in this form to create an account.</p>
            <hr>
            <label for="Name" ><b>Name</b></label><br>
            <input type="text" placeholder="Enter your Name"  name="Name" minlength=4 required>
            <br><label for="email" ><b>Email</b></label><br>
            <input type="email" placeholder="Enter your Email" name ="email" required>
            <br><label for="password" ><b>Password</b></label><br>
            <input type="password" placeholder="Password" name="password" minlength=6 required> 
            <br><label for="confirm"><b>Confirm Password</b></label><br>
            <input type="password" placeholder="Confirm Password" name="confirm">
            <br><label for="phone" ><b>Mobile Number</b></label><br>
            <input type="tel" placeholder="Enter your Mobile number" id="m" onchange="con()"  name="phone" minlength=10 maxlength=10 required>
            <br><label for="address" ><b>Address</b></label><br>
            <input type="text" placeholder="Enter your Address" name="address" required>
            <br>
           <center> <input type="submit" id="submit" value ="Signup"></center>

    </fieldset> </form>
    </body>

</html>
--%>

<!DOCTYPE html>
<html>
<head>
	<title>SignUp Form</title>
	<link rel="stylesheet" href="style.css">
        <script>
    function con()
    {
        var x1=document.getElementById("m").value;
        if(x1.length!=10||isNaN(x1))
        {
            alert("Enter valid number");
        }
    }
    </script>
	<style>
	body
{
	background-image:url(signup.jpg);
	background-repeat: no-repeat;
        margin:0;
}
.simple-form
{
	text-align:center;
	margin: 100px 400px;
}
#register
{
	width:100%;
	background-color:#AARRGGBB;
	opacity:0.50 ; 
	padding:0px 0px;
}
#button
{
	padding:10px;
	border-radius: 5px;
}
.heading
{
	text-align:center;
	margin: 50px 100px;
	color:black; 
}
img.avatar {
    width: 7%;
    hieght:7%;
    border-radius: 30%;
}
input{
    padding:10px;
    border-radius: 5px;
    width:250px;
}
</style>
</head>
<body>
	<div class="heading">
		<h1>Signup form</h1>
                <img src="user.png" alt="Avatar" class="avatar">
<div class="simple-form">
	 <form action="InfoAdd" id="register" name="form" method="post" style="border:1px ">
    <%-- <input type="text" name="fname" id="fname" placeholder="First Name" style="padding:10px;border-radius: 5px; width:250px;"><br><br>
     <input type="text" name="lname" id="lname" placeholder="Last Name" style="padding:10px;border-radius: 5px;width:250px;"><br><br>
     <input type="email" name="email" id="email" placeholder="Email" style="padding:10px;border-radius: 5px;width:250px;"><br><br>
     <input type="password" name="pass" id="pass" placeholder="Password" style="padding:10px;border-radius: 5px;width:250px;"><br><br>
     <input type="number" name="num" id="num" placeholder="Phone no" style="padding:10px;border-radius: 5px;width:250px;"><br><br>
     <input type="submit" value="Signup" id="sub" style="color:green;">
--%>
  
            <label for="Name" ><b></b></label><br>
            <input type="text" placeholder="Enter your Name"  name="Name" minlength=4 required>
            <br><label for="email" ><b></b></label><br>
            <input type="email" placeholder="Enter your Email" name ="email" required>
            <br><label for="password" ><b></b></label><br>
            <input type="password" placeholder="Password" name="password" minlength=6 required> 
            <br><label for="confirm"><b></b></label><br>
            <input type="password" placeholder="Confirm Password" name="confirm">
            <br><label for="phone" ><b></b></label><br>
            <input type="tel" placeholder="Enter your Mobile number" id="m" onchange="con()"  name="phone" minlength=10 maxlength=10 required>
            <br><label for="address" ><b></b></label><br>
            <input type="text" placeholder="Enter your Address" name="address" required>
            <br><br>
           <center> <input type="submit" id="submit" value ="Signup"></center>
</form>
</div>
 <p style="color:black;"> already have an account! <a style="color:blue;" href="Login.jsp"> Login</a>.</p>
</div>
</body>
</html>