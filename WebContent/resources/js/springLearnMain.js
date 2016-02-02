var menuList;

$(document).ready(function(){
	initMenu();
});

function initMenu(){
	$.ajax({
		dataType : "json",
		url : contextPath+'/home/getMenu',
		data : null,
		method : 'post',
		async : false,
		success : function(response) {
			menuList = response.menuList;
			loadMenu();
		}
	});
}

function loadMenu(){
	var menuDiv = $('#menu');
	var $ul = $('<ul></ul>');
	for(var i=0;i<menuList.length;i++){
		var menu = menuList[i];
		var $li = $('<li></li>');
		if(i == 0){
			$li.addClass('active');
		}
		var $a = $('<a></a>').prop('href','#').addClass('menuHyperLink');
		$a.text(menu.menuName);
		$li.append($a);
		$ul.append($li);
	}
	menuDiv.append($ul);
	
	$('.menuHyperLink').click(function(){
		$('#menu').find('li').each(function(){
			$(this).removeClass('active');
		});
		$(this).parent().addClass('active');
	});
}