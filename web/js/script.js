    var projects;
    var isbnlivro;
    var isbn;

    $(document).ready(function() {

      var settings = {
        "async": true,
        "crossDomain": true,
        "url": "http://digito.azurewebsites.net/livro",
        "method": "GET",
        "headers": {
          "Cache-Control": "no-cache",
          "Postman-Token": "ce2e739c-53ea-4587-a604-5fe6f46ff8f4"
        }
      }

      $.ajax(settings).done(function (response) {
        console.log(response);
      });

  var typingTimer; //timer identifier
  var doneTypingInterval = 1; //time in ms, 1 second for example
  var json;
  //on keyup, start the countdown
  $('#campo').keyup(function() {
  	clearTimeout(typingTimer);
  	if ($('#campo').val) {
  		typingTimer = setTimeout(doneTyping, doneTypingInterval);

  	}
  });

    //Buscar através da digitação e pressionando o espeaço
    function doneTyping() {
    	busca(campo.value);
    }

    //Exibir lista de livros do autocompletar
    function autocompletar() {
    	var ii = 0;
    	if (!!projects || !!json){
    		$( "#campo" ).autocomplete({
    			position: { my : "center bottom", at: "center top" },
    			source:json,
    			select: function( event, ui ) {
    				isbn = $('.ui-state-focus');
    				isbn = isbn["0"].attributes.value.value;
    				return buscaselecionado(isbn);
            //return monstra(isbn);
          }
        });
    		$('#campo').data( "ui-autocomplete" )._renderItem = function( ul, item ) {
    			var imagem;
    			var $li = $('<li >'),
    			$img = $('<img>');
    			if(!!projects.items[ii].volumeInfo.imageLinks){
    				imagem  = projects.items[ii].volumeInfo.imageLinks.smallThumbnail
    			}else{
    				imagem ="";
    			}

    			$img.attr({
    				src: src= imagem,
    				alt: item.label,
    				height: "50px",
    				width:"40px"
    			});

    			$li.attr('data-value', item.label);
    			$li.append('<a href="#" value='+projects.items[ii].volumeInfo.industryIdentifiers["0"].identifier+'>');
    			$li.find('a').append($img).append(item.label);    
    			ii++;
    			return $li.appendTo(ul);
    		};
    		$('#campo').data( "ui-autocomplete" )._resizeMenu = function() {
    			this.menu.element.outerWidth( 300 );
    		}
    	}
    } 
    // Buscar através do titulo do livro 
    function busca(livros){
    	var settings = {
    		"async": true,
    		"crossDomain": true,
    		"url": "https://www.googleapis.com/books/v1/volumes?q="+livros,
    		"method": "GET",
    		"printType": "books",
    		"maxResults": "40",
    		"headers": {
    			"Cache-Control": "no-cache"
    		}
    	}

    	$.ajax(settings).done(function (response) { 
    		projects = response;

    		var obj=[] ;
    		for (i in response.items){
    			obj[i] =response.items[i].volumeInfo.title;
    		}

    		json = obj;      

    		autocompletar();
         //alert(response.items[0].volumeInfo.title);
       })

    };


    // Buscar livro selecionado
    function buscaselecionado(livros){
    	var settings = {
    		"async": true,
    		"crossDomain": true,
    		"url": "https://www.googleapis.com/books/v1/volumes?q="+livros,
    		"method": "GET",
    		"printType": "books",
    		"maxResults": "40",
    		"headers": {
    			"Cache-Control": "no-cache"
    		}
    	}

    	$.ajax(settings).done(function (response) { 
    		projects = response;

    		var obj=[] ;
    		for (i in response.items){
    			obj[i] =response.items[i].volumeInfo.title;
    		}

    		json = obj;      

    		mostra(livros);
         //alert(response.items[0].volumeInfo.title);
       })

    };

    // Relatório do livro para cadastro
    function mostra(isbnlivro){
                      // Informação retorna no HTML
                      var imagem;
                      busca(isbnlivro);
                      document.getElementById("livro").innerHTML = projects.items[0].volumeInfo.title;
                      document.getElementById("autor").innerHTML = projects.items[0].volumeInfo.authors;
                      document.getElementById("descricao").innerHTML = projects.items[0].volumeInfo.description;
                      document.getElementById("idioma").innerHTML = projects.items[0].volumeInfo.language;
                      document.getElementById("editora").innerHTML = projects.items[0].volumeInfo.publisher;
                      document.getElementById("data").innerHTML = projects.items[0].volumeInfo.publishedDate;
                      console.log(projects.items[0].volumeInfo.industryIdentifiers);
                      isbnlivro = document.getElementById("isbnlivro").innerHTML = projects.items[0].volumeInfo.industryIdentifiers["0"].identifier;
                      document.getElementById("paginas").innerHTML = projects.items[0].volumeInfo.pageCount;

                      if(!!projects.items[0].volumeInfo.imageLinks){
                      	imagem  = projects.items[0].volumeInfo.imageLinks.smallThumbnail;
                      }else{
                      	imagem ="";
                      }

                      document.getElementById("img1").setAttribute("src",imagem);

                    }

    // Buscar funcionarios
    var settings = {
     "async": true,
     "crossDomain": true,
     "url": "https://digito.azurewebsites.net/funcionario",
     "method": "GET",
     "headers": {
      "Cache-Control": "no-cache",
      "Postman-Token": "1a508f45-607e-4d69-968f-cc75c86d755a"
    }
  }


  $.ajax(settings).done(function (response) {
   console.log(response);
   var _htmlOptions = "";

   $.each(response,function(i,response){
    _htmlOptions += "<option value='"+response.idFuncionario+"'>"+response.nome+"</option>";
  });

   $("#funcionarios").append(_htmlOptions);

 });

// Exibir e ocultar objeto
$("#add").click(function(){
	$(".hide").toggle();

});

// Registrar Livro
$("#save").click(function(){
	confirm("Livro Salvo com sucesso.\nSegue confirmação")
	$(".hide").toggle();
	$(".hide2").toggle();
	$("#home").toggle();

	var liberacao = document.getElementById("liberacao").innerHTML = document.getElementById("um").value;
	var nisbn = document.getElementById("isbn").innerHTML = projects.items[0].volumeInfo.industryIdentifiers["0"].identifier;
	var condicao = document.getElementById("condicao").innerHTML = document.getElementById("statuslivro").value;
	var usuario = $("#funcionarios").val();
	document.getElementById("usuario").innerHTML = document.getElementById("funcionarios").value;
	console.log(liberacao,nisbn,condicao,usuario);
	var settings = {
		"async": true,
		"crossDomain": true,
		"url": "http://digito.azurewebsites.net/salvaLivro",
		"method": "POST",
		"headers": {
			"Content-Type": "application/json",
			"Cache-Control": "no-cache",
			"Postman-Token": "1b046b8a-f424-47d7-987f-15b2daf54978"
		},
		"processData": false,
		"data": '{"isbn":"' + nisbn +' " ,"condicao":"' + condicao +' ","liberacao":"' + liberacao +' ","usuario":"' + usuario +' " }'

	}

	$.ajax(settings).done(function (response) {
		console.log(response);
	}).fail(function() {
		alert( response);
	});



});




});
