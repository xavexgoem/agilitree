<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="assets/css/contact.css" rel="stylesheet" type="text/css" />
<title>Contact Us!</title>
</head>
<body>
	<div id="fullwrap">
		<div id="contact_wrap">
			<ul id="nav">
				<li><a id="home" href="">-Go Home?</a></li>
			</ul>
			<form action="Contact" method="post">
				<h1>Contact Us</h1>
				First Name:<br> <input type="text" name="firstName"
					id="contactFirstName" value="Ron"required><br> Last Name:<br>
				<input type="text" name="lastName" id="contactLastName"
					value="Burgandy"required><br> Email:<br> <input
					type="text" name="contactEmail" id="contactEmail"
					value="afternoondelight69@gmail.com"required><br>
				<br> Contact Us:<br>
				<textarea name="commentsBox" id="contactCommentsBox"required>
		Please let us know why you are contacting us today? Might need a new option not sure how 
		textarea will work feel free to change!
		</textarea>
		<div>
				<br>
				<button type="submit" value="Submit">Submit</button>
		</div>
			</form>
		</div>
	</div>
</body>

</html>
