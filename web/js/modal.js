
var labelID;

$('.teste').click(function() {
  labelID = $(this).attr('for');
  $('#' + labelID).toggleClass('active');
});