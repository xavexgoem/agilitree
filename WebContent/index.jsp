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
        <div id="wrapintro">
          <p>Carl's Card Shop opened in March 2019. We have the best
          selection of table top games and products in the Eau Claire area.
          Several days a week we host various events for anyone to join. If
          you are a new or experienced player come on down and check out all
          that is happening. Be sure to check our <a href="calendar.jsp">calendar!</a>
          We'd be nothing if not for that!</p>
        </div>
        <div id="ygo">
          <div id="ygobanner">
            <a href=""><img src=""></a>
          </div>
          <div id="ygodesc">
            <h2 class="banner">Yu-Gi-Oh!</h2>
            <p>Blah blah content. Something something new deck I'm just
            gonna go to sleep after I test the capacity of this box by just
            kinda casually typing and typing until it gets to where I need it
            to be. I'll worry about the whole fixing the image to the left
            later.</p>
            <br>
            <p>Also, pixels aren't absolute, who knew? Me, I knew.</p>
          </div>
        </div>

        <div id="calendarwrapper">
          <div id="calendar"></div>
          <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
          <script type="text/javascript" src="assets/js/calendar.js"></script>
          <script type="text/javascript" src="assets/js/events.js"></script>
        </div>

                <br>
        <div id="mtg">
          <div id="mtgbanner">
            <a href=""><img src=""></a>
          </div>
          <div id="mtgdesc">
            <h2 id="mtgt">Magic: The Gathering</h2>
            <p>Blah blah content. Something something new deck I'm just
            gonna go to sleep after I test the capacity of this box by just
            kinda casually typing and typing until it gets to where I need it
            to be. I'll worry about the whole fixing the image to the left
            later.</p>
            <br>
            <p>Also, pixels aren't absolute, who knew? Me, I knew.</p>
          </div>
        </div>
        <br>
        <div id="nin">
          <div id="ninbanner">
            <a href=""><img src=""></a>
          </div>
          <div id="nindesc">
            <h2 id="nint">Nintendo</h2>
            <p>Blah blah content. Something something new game I'm just
            gonna go to sleep after I test the capacity of this box by just
            kinda casually typing and typing until it gets to where I need it
            to be. I'll worry about the whole fixing the image to the left
            later.</p>
            <br>
            <p>Also, pixels aren't absolute, who knew? Me, I knew.</p>
          </div>
        </div>

      </div>
    </div>
  </body>
  <br>
  <footer>
    2019 Carl's Card Shop<br> For more information, help, or any of
    the above, contact:<br> (1)555-555-5555 OR email dummy@gmail.com
  </footer>
