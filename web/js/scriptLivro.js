$(document).ready(function () {
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
    // console.log(response);
    var _htmlOptions = "";

    $.each(response, function (i, response) {
      _htmlOptions += "<option value='" + response.idFuncionario + "'>" + response.nome + "</option>";

    });

    $("#funcionarios").append(_htmlOptions);
    buscalivro($("#funcionarios").val());
    reservaUsuario($("#funcionarios").val());


  });

  // Mudar livro corresponde ao funcionario selecionado li
  $("#funcionarios").change(function () {
    $("#listalivros").empty();
    $("#Reservados").empty();
    buscalivro($("#funcionarios").val());
    reservaUsuario($("#funcionarios").val());


  });

  //Busca livro do usuário
  function buscalivro(id) {
    var settings = {
      "async": true,
      "crossDomain": true,
      "url": "https://digito.azurewebsites.net/livros/" + id,
      "method": "GET",
      "headers": {
        "Cache-Control": "no-cache",
        "Postman-Token": "707c34f8-ae28-41b7-bfcb-9b5b2a6692a7"
      }
    }

    $.ajax(settings).done(function (response) {
      //console.log(response);
      var livrosisbn = "";
      $.each(response, function (i, response) {
        $("#livros").append("<option value='" + response.idlivro + "'>" + response.isbn + "</option>");
        buscaimg(response.isbn);
        // console.log(response.isbn);

      });

    });

  };

  // Buscar livro pelo isbn
  function buscaimg(livros) {
    var settings = {
      "async": true,
      "crossDomain": true,
      "url": "https://www.googleapis.com/books/v1/volumes?q=" + livros,
      "method": "GET",
      "printType": "books",
      "maxResults": "40",
      "headers": {
        "Cache-Control": "no-cache"
      }
    }

    $.ajax(settings).done(function (response) {
      $("#listalivros").append(
        "<li class=bookEstilo class=book" + livros + "><label class='modal-btn' for='modal-toggle'><img class ='selecionado' value='" + livros + "' src=" + response.items[0].volumeInfo.imageLinks.smallThumbnail + "alt='' /></label></li>");

      $('.selecionado').click(function () {
        var selecao = $(this).attr('value')
        // alert(selecao)
        buscaSelecao(selecao);
      });
    }).fail(function (response) {
      //  console.log(response);

    });

  };

  //=========================================================Reserva=====================================================================
  // Reserva do usuário
  function reservaUsuario(id) {
    var settings = {
      "async": true,
      "crossDomain": true,
      "url": "http://digito.azurewebsites.net/reserva/" + id,
      "method": "GET",
      "headers": {
        "Cache-Control": "no-cache",
        "Postman-Token": "f4d501a1-5ca2-4698-b24b-4fa7e4e34afa"
      }
    }
    $.ajax(settings).done(function (response) {
      $.each(response, function (i, response) {
        //   console.log(response);
        // console.log(response.livroReservado);
        livroReservado(response.livroReservado);
      });
    });
  }
};

function livroReservado(idlivro) {
  var settings = {
    "async": true,
    "crossDomain": true,
    "url": "http://digito.azurewebsites.net/livro/" + idlivro,
    "method": "GET",
    "headers": {
      "Cache-Control": "no-cache",
      "Postman-Token": "79ad46e9-af30-40b7-a5a5-e057065eb86f"
    }
  }

  $.ajax(settings).done(function (response) {

    $.each(response, function (i, response) {
      //   console.log(response.isbn);
      buscaimgReservado(response.isbn);

    });
  });

}

function buscaimgReservado(livros) {
  var settings = {
    "async": true,
    "crossDomain": true,
    "url": "https://www.googleapis.com/books/v1/volumes?q=" + livros,
    "method": "GET",
    "printType": "books",
    "maxResults": "40",
    "headers": {
      "Cache-Control": "no-cache"
    }
  }

  $.ajax(settings).done(function (response) {
    //console.log(response)
    $("#Reservados").append(
      "<li class=bookEstilo class=book" + livros + "><label class='modal-btn' for='modal-toggle' ><img class ='selecionado' value='" + livros + "' src=" + response.items[0].volumeInfo.imageLinks.smallThumbnail + "alt='' /></label></li>");
    $('.selecionado').click(function () {
      var selecao = $(this).attr('value')
      // alert(selecao)
      buscaSelecao(selecao);

    });
  }).fail(function (response) {
    // console.log(response);
  });
};

// Efeito Collapsible
function expandAll() {
  $(".collapsible-header").addClass("active");
  $(".collapsible").collapsible({ accordion: false });
}

function collapseAll() {
  $(".collapsible-header").removeClass(function () {
    return "active";
  });
  $(".collapsible").collapsible({ accordion: true });
  $(".collapsible").collapsible({ accordion: false });
}

// Modal

function buscaSelecao(selecao) {
  var settings = {
    "async": true,
    "crossDomain": true,
    "url": "https://www.googleapis.com/books/v1/volumes?q=" + selecao,
    "method": "GET",
    "printType": "books",
    "maxResults": "40",
    "headers": {
      "Cache-Control": "no-cache"
    }
  }

  $.ajax(settings).done(function (response) {
    console.log(response);
    console.log(response.items[0].volumeInfo.title)
    console.log(response.items[0].volumeInfo.authors)
    console.log(response.items[0].volumeInfo.description)
    console.log(response.items[0].volumeInfo.language)
    console.log(response.items[0].volumeInfo.publisher)
    console.log(response.items[0].volumeInfo.publishedDate)



     document.getElementById("livro").innerHTML = response.items[0].volumeInfo.title;
     document.getElementById("autor").innerHTML = response.items[0].volumeInfo.authors;
    //  document.getElementById("descricao").innerHTML = response.items[0].volumeInfo.description;
     document.getElementById("idioma").innerHTML = response.items[0].volumeInfo.language;
     document.getElementById("editora").innerHTML = response.items[0].volumeInfo.publisher;
     document.getElementById("data").innerHTML = response.items[0].volumeInfo.publishedDate;
    // console.log(response.items[0].volumeInfo.industryIdentifiers);
    // isbnlivro = document.getElementById("isbnlivro").innerHTML = response.items[0].volumeInfo.industryIdentifiers["0"].identifier;
    // document.getElementById("paginas").innerHTML = response.items[0].volumeInfo.pageCount;

  }).fail(function (response) {
    //  console.log(response);

  });

};