angular.module('kbApp')
    .directive('showMenu', [function() {
        return {
            scope: {
                menuList: '=',
                classFun: '&',
                clickFun: '&'
            },
            restrict: 'E',
            templateUrl: '../resources/angularTemplate/showMenu.html',
            link: function($scope, $element, $attr) {

                $scope.takeClass = function(menu) {
                    return $scope.classFun({ 'menu': menu });
                };

                $scope.takeClick = function(menu) {
                    $scope.clickFun({ 'menu': menu });
                };
            }
        };
    }]);