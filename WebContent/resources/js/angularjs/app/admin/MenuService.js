angular.module('kbApp')
    //	.factory('MenuService', ['$http','$log', function($http,$log){
    //		return {
    //			queryMenu : function(){
    //				return $http.get(contextPath+'/home/getMenu');
    //			}
    //		};
    //	}]);

//使用 ngResource and RESTful url template
.factory('MenuService', ['$resource', function($resource) {
    return $resource(contextPath + '/home/menu/:id', null, {
        //因應資料型態 isArray 取消預設改為 false
        query: {
            method: 'GET',
            isArray: false
        }
    });
}]);