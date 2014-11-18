angular.module('TabsApp')
    .controller('LoginFormCtrl', ['LoginService','GetLoginDataService',function (LoginService,GetLoginDataService) {
        var self = this;

        self.sendFormData = function(){
            LoginService.login(self.user);
        }

        self.receivedLoginData = {};

        self.getFormData = function(){
            self.receivedLoginData = GetLoginDataService.getLogin();
        }
    }]);


