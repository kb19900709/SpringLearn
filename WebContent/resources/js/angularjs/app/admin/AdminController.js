angular.module('kbApp')
    .controller('AdminCtrl', ['$log','MenuService','filterFilter','$location', function($log,menuSrv,filterFilter,$location) {
    	var self = this;
    	self.menuList = [];
    	self.currentMenu = null;
    	
    	menuSrv.query(function(response){
    		self.menuList = processMenuList(response.menuList);
    		changeCurrentMenu();
    	},function(error){
    		$log.log(angular.toJson(error));
    	});
    	
    	self.clickMenu = function(menuClick){
    		angular.forEach(self.menuList,function(menu){
    			if(!angular.equals(menuClick, menu)){
    				menu.selected = 0;
    			}else{
    				menu.selected = 1;
    			}
    		});
    		changeCurrentMenu();
    	};
    	
    	self.isSelected = function(menu){
    		if(menu.selected == 1){
    			return {
    				active : true
    			};
    		}
    	};
    	
    	function changeCurrentMenu(){
    		//filterFilter... 須注意回傳array
    		self.currentMenu = filterFilter(self.menuList,getSelectedMenu)[0];
    	}
    	
    	function getSelectedMenu(menu){
    		if(menu.selected != 1){
    			return false;
    		}else{
    			return true;
    		}
    	}
    	
    	function processMenuList(menuList){
    		var menu;
    		for(var i=0;i<menuList.length;i++){
    			menu = menuList[i];
    			if(i!=0){
    				menu.selected = 0;
    			}else{
    				menu.selected = 1;
    			}
    		}
    		return menuList;
    	};
    }]);
