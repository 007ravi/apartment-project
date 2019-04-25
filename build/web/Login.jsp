
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<title>LOGIN</title>
<link rel="icon" href="user.png" height="30" width="60">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {background-color: white;
      background-image: url(signup.jpg);
    font-family: Arial, Helvetica, sans-serif;}
form {border: 0px;
     text-align:center;
}
#button
{
	padding:10px;
	border-radius: 5px;
         
    width:250px;
}
input[type=text], input[type=password] {
    width: 60%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
.signin {
    background-color:#ffffff;
  text-align: center;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 15%;
    border-radius: 50%;
}

.container {
    padding: 70px;
}
</style>
</head>
<body>
<form action="LoginServlet">
  <div class="container">
    <h1>LOGIN</h1>
    <img src="user.png" alt="Avatar" class="avatar">
    <hr>

  <label for="email"><b>Enter Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
   <br>
   <br>
   <label for="psw"><b>Password</b></label>
   <input type="password" placeholder="Enter Password" name="password" required>
   <br>
   <br>
<!--    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>-->
    <button type="submit" class="registerbtn" id="button">LOGIN</button>
  
    <p style="color:black;">Don't have an account? <a style="color:blue;" href="Signup.jsp">Sign up</a>.</p>
  
  </div>
    </hr>
   
</form>
</body>
</html>

