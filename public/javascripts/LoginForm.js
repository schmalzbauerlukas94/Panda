angular.module('TabsApp')
    .controller('LoginFormCtrl', ['LoginService', 'GetLoginDataService', function (LoginService, GetLoginDataService) {
        var self = this;
        self.loginDataGet = {};
        self.loginDataSend = {};
        self.testData = {};

        self.sendFormData = function () {
            LoginService.login(self.user);
        };

        self.getFormData = function () {
            GetLoginDataService.getLogin().then(function (response) {
                self.loginDataGet = response.data;
            });

        };

    }]);
