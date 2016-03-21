//注入 ngResource & ngRoute 模組
angular.module('kbApp', ['ngResource', 'ngRoute'])
    .config(['$routeProvider', function($routeProvider) {
        //dynamic routing configuration
        $routeProvider.when("/:path1/:path2", {
            templateUrl: function(attr) {
                var url = '../views/' + attr.path1 + '/' + attr.path2 + '.jsp';
                return url;
            }
        });
    }]);