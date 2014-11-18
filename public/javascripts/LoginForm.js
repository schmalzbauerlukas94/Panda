angular.module('TabsApp')
    .controller('LoginFormCtrl', ['LoginService',function (LoginService) {
        var self = this;

        self.sendFormData = function(){
            LoginService.login(self.user);
        }
    }]);


