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
		var $a = $('<a></a>').prop('href','#')
							 .prop('subMenu', menu.menuDetailList)
							 .addClass('menuHyperLink');
		$a.text(menu.menuName);
		$li.append($a);
		$ul.append($li);
		
		if(i == 0){
			$li.addClass('active');
			loadSubMenu(menu.menuDetailList);
		}
	}
	menuDiv.append($ul);
	
	$('.menuHyperLink').click(function(){
		$('#menu').find('li').each(function(){
			$(this).removeClass('active');
		});
		$(this).parent().addClass('active');
		
		var $functionTargetUL = $('#functionList');
		$functionTargetUL.empty();
		loadSubMenu($functionTargetUL,$(this).prop('subMenu'));
	});
	
	function loadSubMenu(target,menuDetailList){
		if(!menuDetailList){
			return;
		}
		for(var i=0;i<menuDetailList.length;i++){
			var subMenu = menuDetailList[i];
			var $li = $('<li></li>');
			if(i == 0){
				$li.addClass('first');
			}
			
			var $p1 = $('<p class="date"></p>');
			var date = new Date(subMenu.createDate).toLocaleDateString();
			$p1.text(date);
			
			var $p2 = $('<p class="subMenuName"></p>');
			$p2.prop('menuFunctiongPage',subMenu.menuFunctiongPage);
			var $h3 = $('<H3></H3>');
			var $a = $('<a href="#" style="color:red;"></a>');
			$a.text(subMenu.menuDetailName);
			$h3.append($a);
			$p2.append($h3);
			
			var $p3 = $('<p></p>');
			$p3.text(subMenu.menuDetailDesc);
			
			$li.append($p1).append($p2).append($p3);
			
			target.append($li);
		}
		
		$('.subMenuName').click(function(){
			dispatcherFun($(this).prop('menuFunctiongPage'));
		});
	}
}

function dispatcherFun(dispatcherPage){
	var data = {};
	data.pageName = dispatcherPage;
	$('#content').load(contextPath+'/forward/dispatcher',data);
}