 $(document).ready(function() {

 		var settings = {
 			"async": false,
 			"crossDomain": true,
 			"url": "http://digito.azurewebsites.net/salvaFuncionario",
 			"method": "POST",
 			"headers": {
 				"Content-Type": "application/json",
 				"Cache-Control": "no-cache",
 				"Postman-Token": "b193ad72-9a51-4b2f-abc0-03717a430aee"
 			},
 			"processData": false,
 			"data": "    {\n        \"nome\": \"Marcos Camargo\",\n        \"re\": \"91520z\",\n        \"exp\": 800000\n  \n    }"
 		}

 		$.ajax(settings).done(function(response) {
 			console.log(response);
 		});

 
 });





