$(document).ready(function() {
  buscaFuncionario();
});

//======================================== metodos ==================================================
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
    buscalivro($("#funcionarios").val());

  });

  // Mudar livro corresponde ao funcionario selecionado li
  $("#funcionarios").change(function(){
   $("#listalivros").empty();
   buscalivro($("#funcionarios").val());


 });

//Busca livro do usuário
function buscalivro(id){
  var settings = {
    "async": true,
    "crossDomain": true,
    "url": "https://digito.azurewebsites.net/livro/"+id,
    "method": "GET",
    "headers": {
      "Cache-Control": "no-cache",
      "Postman-Token": "707c34f8-ae28-41b7-bfcb-9b5b2a6692a7"
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


};

