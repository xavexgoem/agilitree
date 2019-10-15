<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="assets/css/contact.css" rel="stylesheet" type="text/css" />
<link href="assets/css/main.css" rel="stylesheet" type="text/css" />
<title>Contact Us!</title>
</head>
<body>
	<div id="fullwrap">
		<div id="contact_wrap">
		<div id="wrappert">
        <h1 class="title">
          <a id="css" href="index.jsp"><img src="assets/banner/ccs.png"
                           style="width: 280px; height: 100px;"></a>
        </h1>
      </div>
      <div id="contentmain">
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
				<button type="submit" value="Submit">Submit</button>
		</div>
			</form>
		<footer>
    2019 Carl's Card Shop<br> For more information, help, or any of
    the above, contact:<br> (1)555-555-5555 OR use the form on this page huh?
  </footer>
		</div>
		
		</div>
		
	</div>
</body>

</html>
