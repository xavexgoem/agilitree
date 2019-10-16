
$.ajax({
    type: 'get', 
    url: 'GetEvents',
    dataType: 'JSON',
    data: { 
      loadProds: 1,
      test: JSON.stringify() 
    },
    success: function(data) {

    	var events = [];
    	
    	for (i = 0; i < data.length; i++) {
   		var dates = data[i].startDate;
   		
   		var year = dates.substring(0, 4);
   		var month = dates.substring(5, 7);
   		var day = parseInt(dates.substring(8, 10)) + 1;
   		
   		var startTime = data[i].startTime;
   		var endTime = data[i].endTime;
   		
   		
   		var titles = data[i].title;
   		var desc = data[i].description;
   		var color = data[i].categoryColor;
   		
   		console.log(day);
   		
    	events.push({'Date': new Date(year, month, day), 'Title': titles, 'StartTime': startTime, 'EndTime': endTime, 'Desc': desc, 'DId': [i], 'Clr': color});
   		

    	}
    	


    	
   		var settings = {};
   		var element = document.getElementById('calendar');
    	calendar(element, events, settings);

    },
    error: function(data) {
        alert('fail');
    }
});
 






