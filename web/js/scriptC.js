 $(document).ready(function() {

 	$("#addC").click(function(){
 		var nome =document.getElementById("nome").value
 		var nome2 =document.getElementById("nome2").value
 		var re = document.getElementById("re").value
 		var exp = document.getElementById("exp").value
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
 			"data":     '{"nome":"'+nome+' '+nome2+'","re":"'+re+'","exp":'+exp+'}'
 		}

 		$.ajax(settings).done(function(response) {
 			console.log(response);
 			confirm("Cadastrado com sucesso");
 		});
 	});
 	

 	
 	//$("#cls").click(function(){
 	//	$('#form')[0].reset();

 	//});
 });




