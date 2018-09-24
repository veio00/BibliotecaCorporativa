 $(document).ready(function() {

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


   // Buscar livro selecionado
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
         //alert(response.items[0].volumeInfo.title);
       }).fail(function (response) { 
        console.log(response);
      });



     };

   });