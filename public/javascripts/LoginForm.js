angular.module('TabsApp')
    .controller('LoginFormCtrl', ['LoginService', 'GetLoginDataService', function (LoginService, GetLoginDataService) {
        var self = this;
        self.loginDataGet = {};
        self.loginDataSend = {};
        self.testData = {};

        self.sendFormData = function () {
            self.loginDataSend = self.user;
            LoginService.login(self.user);
        };

        self.getFormData = function () {
            GetLoginDataService.getLogin().then(function (response) {
                self.loginDataGet = response.data;
            });

        };

        self.getTestData = function () {
            return self.testData = [{
                "username": "Benno",
                "password": "Benno123"
            }, {
                "username": "Maria",
                "password": "Maria123"
            }, {
                "username": "Maria55",
                "password": "Maria123"
            }];
        }
    }]);
