 $(document).ready(function() {
// Menu  
    var active1 = false;
    var active2 = false;
    var active3 = false;
    var active4 = false;

    $('.parent2').on('mousedown touchstart', function() {
    	if (!active1) $(this).find('.test1').css({'background-color': 'gray', 'transform': 'translate(0px,120px)'});
    		else $(this).find('.test1').css({'background-color': 'dimGray', 'cursor':'pointer', 'transform': 'none'}); 
    		if (!active2) $(this).find('.test2').css({'background-color': 'gray', 'transform': 'translate(0px,190px)'});
    			else $(this).find('.test2').css({'background-color': 'darkGray', 'cursor':'pointer', 'transform': 'none'});
    			if (!active3) $(this).find('.test3').css({'background-color': 'gray', 'cursor':'pointer', 'transform': 'translate(0px,260px)'});
    				else $(this).find('.test3').css({'background-color': 'silver', 'cursor':'pointer', 'transform': 'none'});
    				if (!active4) $(this).find('.test4').css({'background-color': 'gray', 'cursor':'pointer', 'transform': 'translate(0px,330px)'});
    					else $(this).find('.test4').css({'background-color': 'silver', 'cursor':'pointer', 'transform': 'none'});
    					active1 = !active1;
    					active2 = !active2;
    					active3 = !active3;
    					active4 = !active4;

    				});

});