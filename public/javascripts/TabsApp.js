angular.module('TabsApp', [])
    .controller('TabsCtrl', [ function () {
        var self = this;
        self.tabs = [{
            title: 'Description',
            url: 'one.tpl.html'
        }, {
            title: 'Data',
            url: 'two.tpl.html'

        }];
        self.credentials = [{
            "username": "Benno",
            "password": "Benno123"
        }, {
            "username": "Maria",
            "password": "Maria123"
        }, {
            "username": "Maria55",
            "password": "Maria123"
        }];


        self.currentTab = 'one.tpl.html';

        self.onClickTab = function (tab) {
            self.currentTab = tab.url;
        };

        self.isActiveTab = function (tabUrl) {
            return tabUrl == self.currentTab;
        }
    }]);

