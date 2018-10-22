$(document).ready(function () {
	carregarForum();
	
});

function carregarForum(){
	var settings = {
		"async": true,
		"crossDomain": true,
		"url": "http://digito.azurewebsites.net/forum",
		"method": "GET",
		"headers": {
			"cache-control": "no-cache",
			"Postman-Token": "e4e5f990-03e7-412a-a705-7c57a492266a"
		}
	}

	$.ajax(settings).done(function (response) {

		$.each(response, function (i, response) {
			buscaimg(response.iSBNref);

		});

	});

}

// Buscar livro pelo isbn
function buscaimg(livros){
	var settings = {
		"async": true,
		"crossDomain": true,
		"url": "https://www.googleapis.com/books/v1/volumes?q="+livros,
		"method": "GET",
		"headers": {
			"cache-control": "no-cache",
			"Postman-Token": "47610648-8fc7-47b2-84df-3dc607951e5d"
		}
	}

	$.ajax(settings).done(function (response) {
		console.log(response.items[0].volumeInfo.pageCount)
		console.log(response.items[0].volumeInfo.title);
		console.log(response.items[0].volumeInfo.authors);
		console.log(response.items[0].volumeInfo.imageLinks.smallThumbnail);
		$.ajax(settings).done(function (response) { 
		
			$("#listaforuns").append("<div  id= 'caixaLivro'  class='c-forum t-forum'><a  id= 'caixa' class='t-forum-body'href=''>\
				<span class='c-forum-media t-forum-media'><svg class='o-icon c-forum-media-icon-read t-forum-media-icon-read'>\
				<use xlink:href='#forum'></use></svg></span>\
				<div class='c-forum-info t-forum-info' >\
				<h4 class='c-forum-title t-forum-title'><a href=''> <img src="+response.items[0].volumeInfo.imageLinks.smallThumbnail+"alt='' /></a></h4>\
				<p class='c-forum-text t-forum-text' id='text1'>TÍTULO\n "+response.items[0].volumeInfo.title+"</p>\
				<p class='c-forum-text t-forum-text' id='text2'>AUTOR\n "+response.items[0].volumeInfo.authors+"</p>\
				</div></a>\
				<div id= 'footer' class='o-bar c-forum-footer t-forum-footer'>\
				<ul class='o-bar-left'>\
				<li class='o-bar-item'>\
				<span class='o-bar-info'>\
				<svg class='o-icon o-bar-info-icon'><use xlink:href='#topic'></use></svg>\
				<span class='o-bar-item-text'>"+response.items[0].volumeInfo.pageCount+"</span>\
				</span>\
				</li>\
				<li class='o-bar-item'>\
				<span class='o-bar-info'>\
				<svg class='o-icon o-bar-info-icon'><use xlink:href='#replies'></use></svg>\
				<span class='o-bar-item-text'>196</span>\
				</span>\
				</li>\
				</ul>\
				<ul class='o-bar-right'>\
				<li class='o-bar-item selecionadoForum'>\
				<a class='o-bar-action '   data-toggle='tooltip' data-placement='top' title='Re: ukyuk, by hanakin, 1485294359'>\
				<svg  class='o-icon o-bar-action-icon'><use xlink:href='#last-page'></use></svg>\
				</a>\
				</li>\
				</ul>\
				</div>\
				</div>\
				</div>\
				</div>\
				</div>");


				$('.selecionadoForum').click(function () {
				
					alert('Forum')
				   
			
				  });

		}).fail(function (response) { 
			console.log(response);
		});

	});

};