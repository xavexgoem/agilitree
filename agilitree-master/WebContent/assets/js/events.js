var events = [
	  {'Date': new Date(2019, 12, 25), 'Title': 'Doctor appointment at 3:25pm.'},
	  {'Date': new Date(2019, 10, 31), 'Title': 'New Garfield movie comes out!', 'Link': 'https://garfield.com'},
	  {'Date': new Date(2019, 9, 27), 'Title': '25 year anniversary', 'Link': 'https://www.google.com.au/#q=anniversary+gifts'},
	];
var settings = {};
var element = document.getElementById('calendar');
calendar(element, events, settings);
