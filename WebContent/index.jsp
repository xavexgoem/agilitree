<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <link href="assets/css/main.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="assets/css/calendar.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css" integrity="sha256-gvEnj2axkqIj4wbYhPjbWV7zttgpzBVEgHub9AAZQD4=" crossorigin="anonymous" />
    <link href="https://fonts.googleapis.com/css?family=Crimson+Text&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
    <title>CCS</title>
  </head>
  <body>
    <div id="fullwrap">
      <div id="wrappert">
        <h1 class="title">
          <a id="css"><img src="assets/banner/ccs.png"
                           style="width: 280px; height: 100px;"></a>
        </h1>
      </div>

      <div id="contentmain">
        <div class="wrapbigtext">
          <p>Carl's Card Shop opened in March 2019. We have the best
          selection of table top games and products in the Eau Claire area.
          Several days a week we host various events for anyone to join. If
          you are a new or experienced player come on down and check out all
          that is happening. Be sure to check our <a href="calendar.jsp">calendar!</a>
          We'd be nothing if not for that!</p>
        </div>

        <div id="calendarwrapper">
          <div id="calendar"></div>
          <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
          <script type="text/javascript" src="assets/js/calendar.js"></script>
          <script type="text/javascript" src="assets/js/events.js"></script>
        </div>
        <div id="ygo">
          <div id="ygobanner">
            <a href=""><img src=""></a>
          </div>
          <div id="ygodesc">
            <h2 class="banner">Yu-Gi-Oh!</h2>
            <p>Players in good financial standing are asked to please follow all rules.</p>
          </div>
        </div>
        <div id="mtg">
          <div id="mtgbanner">
            <a href=""><img src=""></a>
          </div>
          <div id="mtgdesc">
            <h2 class="banner">Magic: The Gathering</h2>
            <p>We reserve the right to ban you for your obnoxious control decks.</p>
          </div>
        </div>
        <br>
        <div id="nin">
          <div id="ninbanner">
            <a href=""><img src=""></a>
          </div>
          <div id="nindesc">
            <h2 class="banner">Nintendo</h2>
            <p>We have everything! Super Mario Brothers 1-3, Zelda 1 and 2, Punch Out, Duck Hunt, etc.</p>
          </div>
        </div>
        <div style="clear: both;"></div> <!--  so floated elements don't go past contentmain -->
		<div class="wrapbigtext">Have any questions? <a href="contact.jsp">Contact us!</a> We have a form.</div>
		<footer>
    2019 Carl's Card Shop<br> For more information, help, or any of
    the above, contact:<br> (1)555-555-5555 OR email dummy@gmail.com
  </footer>
      </div>
      
    </div>
  </body>
  
