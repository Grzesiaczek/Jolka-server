'use strict';
 
var app = angular.module('myApp',[]);

app.controller('TestController', ['$http', function($http) {
	this.word = 't0';
	this.div = 'empty';
	
	this.change1 = function () {
		this.word = 't1';
	};
	
	this.change2 = function () {
		this.word = 't2';
	};
	
	this.click = function () {
        $http.get('http://localhost:8080/page')
            .then(
            function (response) {
                this.div = response.data;
            },
            function(errResponse){
            	alert(errResponse.data);
            }
        );
	}
}]);

app.controller('KeyController', function() {
	this.total = 0;
	
	this.count = function(event) {
		this.total = event.which;
	};
	
	this.focus = function() {
		this.total += 10;
	}
	
	this.blur = function() {
		this.total += 100;
	}
});