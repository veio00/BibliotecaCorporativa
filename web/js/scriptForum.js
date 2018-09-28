var $menuToggle = '[data-toggle="menu"]';
var $menu = '[data-container="menu"]';

// Dropdown toggle
$($menu).each(function(e) {
	var $this = $(this);
	var $targetOffset = $this.offset();
	var position = "";
	if ($targetOffset.left > $(window).width() / 2) {
       	$this.css({"transform-origin": "right top", "right": "0"});
	} else {
		$this.css("transform-origin", "left top");
	}
});

$($menuToggle).click(function(e) {
	e.preventDefault();
	e.stopPropagation();
	$($menu).each(function(){
		$(this).toggleClass("is-active", false);
	});
	$(this).next($menu).toggleClass("is-active");
});

$(document).click(function(e) {
	var target = e.target;
	if (
		!$(target).is($menu)
		&& !$(target).parents().is($menu)
		&& !$(target).is($menuToggle)
		&& !$(target).parents().is($menuToggle)
	) {
		$($menu).each(function(){
			$(this).toggleClass("is-active", false);
		});
	}
});