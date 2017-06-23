'use strict';
angular.module('webappApp')
.controller ('MainCtrl',['$scope','$http','$location', function ($scope,$http,$location){

			console.log(" test .."); 
			
			$scope.usuario={};
			
			$scope.activa={};
			$scope.validar = function(){
				
				console.log("validando Acceso");
				console.log($scope.usuario);
				
				  $http({
						method: "POST",
						data: $scope.usuario,
						url:"http://localhost:8080/testSpringItc/services/login/inicio"
					}).success(function(data){
						
						if (data.success){
							$scope.activa.menu =  true;
							console.log(data.mensaje);
						}else{
							$scope.activa.menu =  false;
							alert(data.errorMensaje);
							console.log(data.errorMensaje);
						}
						   
					   });
				
			}
			 
			
			
}]);