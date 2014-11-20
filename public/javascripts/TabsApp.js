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


        self.currentTab = 'one.tpl.html';

        self.onClickTab = function (tab) {
            self.currentTab = tab.url;
        };

        self.isActiveTab = function (tabUrl) {
            return tabUrl == self.currentTab;
        }
    }]);

