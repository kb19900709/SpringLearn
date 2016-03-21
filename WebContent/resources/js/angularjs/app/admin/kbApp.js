angular.module('kbApp',['ngResource','ngRoute'])
	.config(['$routeProvider',function($routeProvider){
		$routeProvider.when("/:path",{
			templateUrl : function(attr){
				var url = 'views/'+attr.path+'.jsp';
				return url;
			}
		}).otherwise({redirectTo:contextPath});
	}]);