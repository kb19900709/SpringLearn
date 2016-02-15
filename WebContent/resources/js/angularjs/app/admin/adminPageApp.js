var adminApp = angular.module('adminApp',[]);

adminApp.controller('MainCtrl',['MenuService',function(menuSrv){
	var self = this;
}]);

adminApp.service('MenuService',['$log','$http',function($log,$http){
	$log.log('MenuService init');
	$http.post(contextPath+"/home/getMenu").then(function(response){
		$log.log(response);
	},function(error){
		$log.log("error response + "+ error);
	});
}]);