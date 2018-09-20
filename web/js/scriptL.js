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

    var livrosisbn = "";

    $.each(response,function(i,response){
      livrosisbn += "<option value='"+response.idlivro+"'>"+response.isbn+"</option>";
    });

    $("#livros").append(livrosisbn);

  });

});