<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/signup.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<div id="fullwrap">
		<ul id="nav">
			<li><a id="home" href="">-Go Home?</a></li>
		</ul>
		<form action="SignUp">
			<div id="signup">
				<h1>Sign Up</h1>
				<p>Want to create an account? Fill out the forms below.</p>

				<label for="email"><b>Email</b></label> <br> <input type="text"
					placeholder="Enter Email" name="email" required> <br>
				<br> <label for="psw"><b>Password</b></label> <br> <input
					type="password" placeholder="Enter Password" name="psw" required>
				<br> <br> <label for="psw-repeat"><b>Repeat
						Password</b></label> <br> <input type="password"
					placeholder="Repeat Password" name="psw-repeat" required> <br>
				<label> <input type="checkbox" checked="checked"
					name="remember" style="margin-bottom: 15px"> Remember me
				</label>

				<p>
					By creating an account you agree to our <a href="#"
						style="color: dodgerblue">Terms & Privacy</a>.
				</p>

				<button type="submit" class="signupbtn">Sign Up</button>

			</div>
		</form>
	</div>
</body>
</html>