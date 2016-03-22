angular.module('kbApp')
    .directive('showFunction', [function() {
        return {
        	//宣告成 Attribute 模式
            restrict: 'A',
            //樣板檔案位置
            templateUrl: '../resources/angularTemplate/showFunction.html',
            //宣告為 isolate-scope
            scope: {
                detail: '='
            }
        };
    }]);