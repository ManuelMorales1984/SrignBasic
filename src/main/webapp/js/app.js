'use strict';

var app = angular
  .module('webappApp', [
    'ngRoute',
    'ngTable',
    'ngResource',
    'ngRoute',
    'ngSanitize'
    
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



