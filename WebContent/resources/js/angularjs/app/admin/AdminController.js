angular.module('kbApp')
    //注入 $log、MenuService、$location
    .controller('AdminCtrl', ['$log', 'MenuService', '$location', function($log, menuSrv, $location) {
        var self = this;
        self.menuList = [];
        self.currentMenu = null;

        //初始化 menu 清單
        menuSrv.query(function(response) {
            self.menuList = initMenuList(response.menuList);
        }, function(error) {
            $log.log(angular.toJson(error));
        });

        //處理當前 menu selected ，選到的給1其餘給0
        self.clickMenu = function(menuClick) {
            angular.forEach(self.menuList, function(menu) {
                if (!angular.equals(menuClick, menu)) {
                    menu.selected = 0;
                } else {
                    menu.selected = 1;
                    self.currentMenu = menu;
                }
            });
        };

        //for ngClass (CSS .active)
        self.isSelected = function(menu) {
            if (menu.selected == 1) {
                return {
                    active: true
                };
            }
        };

        //處理 menuList 並給予每個 menu 物件 selected 屬性
        function initMenuList(menuList) {
            var menu;
            for (var i = 0; i < menuList.length; i++) {
                menu = menuList[i];
                if (i != 0) {
                    menu.selected = 0;
                } else {
                    menu.selected = 1;

                    //預設為第一筆資料為當前選擇 menu
                    self.currentMenu = menu;
                    //路由初始等待畫面 
                    $location.path(menu.menuWaitingPage);
                }
            }
            return menuList;
        };
    }]);