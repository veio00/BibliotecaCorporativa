 $(document).ready(function() {
  buscalivro();
  buscaFuncionario();
});

//======================================== metodos ==================================================

//Busca livro do usuário
function buscalivro(livros){
  var settings = {
    "async": true,
    "crossDomain": true,
    "url": "http://digito.azurewebsites.net/livro/",
    "method": "GET",
    "headers": {
      "Cache-Control": "no-cache",
      "Postman-Token": "ce2e739c-53ea-4587-a604-5fe6f46ff8f4"
    }
  }

  $.ajax(settings).done(function (response) {
    console.log(response);

    var livrosisbn = "";
    $.each(response,function(i,response){


     $("#livros").append("<option value='"+response.idlivro+"'>"+response.isbn+"</option>");
     buscaimg(response.isbn);
     console.log(response.isbn);
   });

  });

};


// Buscar livro pelo isbn
function buscaimg(livros){
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
    console.log(response);
    $("#listalivros").append(
      "<li class=bookEstilo class=book"+livros+"><a href=''> <img src="+response.items[0].volumeInfo.imageLinks.smallThumbnail+"alt='' /></a></li>");
  }).fail(function (response) { 
    console.log(response);
  });

};

//Busca todos os usuarios no banco
function buscaFuncionario() {
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

  //preenche funcionarios
  $.ajax(settings).done(function (response) {
    console.log(response);
    var _htmlOptions = "";

    $.each(response, function (i, response) {
      _htmlOptions += "<option value='" + response.idFuncionario + "'>" + response.nome + "</option>";
    });

    $("#funcionarios").append(_htmlOptions);

  });
};

