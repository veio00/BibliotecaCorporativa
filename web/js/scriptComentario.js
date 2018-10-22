$(document).ready(function () {
  

});

$(function(){

  var inDexValue;
  
    $('button').click( function() {
      if($('#userCmnt').val().length == ''){
       alert('Please Enter Your Comment');
       return true;
      }
      var userCmnt = $('#userCmnt').val();
      if($('#submit').hasClass('editNow')){
                 
        $('#cmntContr>div.viewCmnt').eq(inDexValue).children('p').html(userCmnt);
        
      }else{      
    
    $('#cmntContr').append("<div class='viewCmnt'><p>"+ userCmnt + "</p><span class='edit'></span><span class='delete'></span></div>");
     }
      $('#userCmnt').val('');
      $(this).removeClass('editNow');
  });
    
  // Delete 
  $('#cmntContr').on('click', '.delete', function(){   
    confirm("Excluir comentário");
    $(this).parent().remove();
  });
  // Edit
  $('#cmntContr').on('click', '.edit', function(){
   
    var toEdit = $(this).prev('p').html();
    //alert(toEdit);
    $('#userCmnt').val(toEdit);
    $('button').addClass('editNow');
    inDexValue = $(this).parent('div.viewCmnt').index();
    
  });
  });


