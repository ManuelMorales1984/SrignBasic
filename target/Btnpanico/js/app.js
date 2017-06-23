'use strict';

var app = angular
  .module('webappApp', [
    'ngRoute',
    'ngTable'
    
  ]).config(function ($routeProvider) {
	    $routeProvider
	      .when('/', {
	        templateUrl: 'main.html',
	        controller: 'MainCtrl'
	      })
	      .when('/welcome', {
	        templateUrl: 'welcome.html',
	        controller: 'WelcomeCtrl'
	      })
	      .otherwise({
	        redirectTo: '/'
	      });
  		}

  );



