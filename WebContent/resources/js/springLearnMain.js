$(document).ready(function(){
	$('.menuHyperLink').click(function(){
		$('#menu').find('li').each(function(){
			$(this).prop('class','');
		});
		$(this).parent().prop('class','active');
	});
});