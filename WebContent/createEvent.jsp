<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<<link href="assets/css/signIn.css" rel="stylesheet" type="text/css" />
<title>Contact Us!</title>
</head>
<body>
	<div id="fullwrap">
		<div id="createEvent_wrap">
			<ul id="nav">
				<li><a id="home" href="">-Go Home?</a></li>
			</ul>
			<form action="Contact" method="post">
				<h1>Create Event</h1>
				Event Title:<br> <input type="text" placeholder="Event Title "name="eventTitle"
					id="eventTitle" required><br> Date & Time of Event:<br>
				<input type="datetime-local" name="dateOfEvent" id="dateOfEvent"
					value=""><br>
				<br> Description:<br>
				<textarea name="eventDescription" id="eventDescription">
		Please let us know why you are contacting us today? Might need a new option not sure how 
		textarea will work feel free to change!
		</textarea>
		<div>
				<br>
				<button type="submit" value="Submit">Create Event</button>
		</div>
			</form>
		</div>
	</div>
</body>
</html>