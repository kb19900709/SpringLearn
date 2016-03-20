angular.module('kbApp')
//	.factory('MenuService', ['$http','$log', function($http,$log){
//		return {
//			queryMenu : function(){
//				return $http.get(contextPath+'/home/getMenu');
//			}
//		};
//	}]);

	.factory('MenuService',['$resource',function($resource){
		return $resource(contextPath+'/home/menu/:id',null,{
			query : {
				method : 'GET'
				,isArray : false
			}
		});
	}]);