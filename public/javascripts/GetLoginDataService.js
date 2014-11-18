angular.module('TabsApp')
    .factory('GetLoginDataService', ['$http', function ($http) {
        return {
            getLogin:function(){
                return $http.get("/");
            }
        };
    }]);