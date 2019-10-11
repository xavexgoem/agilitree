<%@ page import = "org.cvtc.agilitree.DB,org.cvtc.agilitree.ServletHelper" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="assets/css/signIn.css" rel="stylesheet" type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Contact Us!</title>
</head>
<body>
	<div id="fullwrap">
		<div id="createEvent_wrap">
			<ul id="nav">
				<li><a id="home" href="">-Go Home?</a></li>
			</ul>
			<form action="CreateEvent" method="post">
				<h1>Create Event</h1>
				<!-- Email address:<br><input type="text" placeholder="Email" name="emailAddress" id="emailAddress" required><br>
				Password:<br><input type="password" name="password" id="password" required><br> -->
				Event Title:<br> 
				<input type="text" placeholder="Event Title "name="eventTitle" id="eventTitle" required><br>
				Category:<br>
				<select id="category_select" name="catNumber">
				</select>
				<script>
				
				json = 
				<%= 
				
				ServletHelper.ResultSetToJSON(DB.getInstance().query("SELECT * FROM categories"))
				
				%>;
				
				json.forEach(function(category) {
					$("#category_select").append("<option value=" + category.categoryID + ">" + category.title + "</option>");
				})
				</script>
				
				<br>Start Date:<br>
				<input type="date" name="startDate" id="startDate" value=""><br>
				<br>End Date:<br>
				<input type="date" name="endDate" id="endDate" value=""><br>
				<br>Start Time:<br>
				<input type="time" name="startTime" id="startTime" value=""><br>
				<br>End time:<br>
				<input type="time" name="endTime" id="endTime" value=""><br>
				<br> Description:<br>
				<textarea name="eventDescription" id="eventDescription">
					Please let us know why you are contacting us today? Might need a new option not sure how 
					textarea will work feel free to change!
				</textarea>
				<div>
					<button type="submit" value="Submit">Create Event</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
