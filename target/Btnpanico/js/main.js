'use strict';
angular.module('webappApp')
.controller ('MainCtrl',['$scope','$http','$location', function ($scope,$http,$location){

			console.log(" test .."); 
			
			$scope.usuario={};
			
			
			$scope.validar = function(){
				
				console.log("validando Acceso");
				console.log($scope.usuario);
				
				  $http({
						method: "POST",
						data: $scope.usuario,
						url:"http://localhost:8080/testSpringItc/services/login/inicio"
					}).success(function(data){
						
						if (data.success){
							console.log(data.mensaje);
							$location.path("/welcome"); 
						}else{
							alert(data.errorMensaje);
							console.log(data.errorMensaje);
						}
						   
					   });
				
			}
			 
			
			
}]);