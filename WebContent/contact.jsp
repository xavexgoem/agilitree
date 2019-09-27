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
<div id="contact_wrap">
	<form>
		First Name:<br>
		<input type="text" name="firstName" id="contactFirstName" value="Ron"><br>
		Last Name:<br>
		<input type="text" name="lastName" id="contactLastName" value="Burgandy"><br>
		Email:<br>
		<input type="text" name="contactEmail" id="contactEmail" value="afternoondelight69@gmail.com"><br><br>
		
		Contact Us:<br>
		<textarea name="commentsBox" id="contactCommentsBox">
		Please let us know why you are contacting us today? Might need a new option not sure how 
		textarea will work feel free to change!
		</textarea>
		<br><input type="submit" value="Submit">
	</form>
</div>
</body>
</html>