angular.module('TabsApp')
    .controller('LoginFormCtrl', ['LoginService','GetLoginDataService',function (LoginService,GetLoginDataService) {
        var self = this;
        self.receivedLoginData = {};

        self.sendFormData = function(){
            LoginService.login(self.user);
        }


        self.getFormData = function(){
            GetLoginDataService.getLogin().then(function(response){
                self.receivedLoginData = response.data;
            });

        }
    }]);
