
angular.module('webappApp')
.controller ('ParametrosCtrl',['$scope','$http','ngTableParams','$filter', function ($scope,$http,ngTableParams,$filter){

	console.log("paramteros");
	
	
	 $scope.tablas ={};
	  $scope.tablas.pantallas = [];
	
	$scope.parametros ={
		edad : '',
		pantalla : ''
	}
	
	.edad = {};
	$scope.bandera ={
			validate :false	
	}
	
	$scope.mostrar = function(){
		console.log("initi.")
		$("#myModal").modal("show");
		
	}
	
	 $http({
			method: "POST",
			url:"http://localhost:8080/testSpringItc/services/login/pantallas"
		}).success(function(data){
			console.log("pantallas");
			$scope.tablas.pantallas = data;
			console.log(data);
		
		   });
	 
	 
	  $scope.filters = {myfilter: ''}; 
	  
	  
	$scope.tableParams = new ngTableParams({
		        page: 1,            // show first page
		        count: 10,
		        filter: $scope.filters,
		        sorting: {	
		        	     // initial sorting

		        }
		    }, {
		     count:[], //here put empty counts
	         total: $scope.tablas.pantallas.length, // length of data
		      getData: function($defer, params) {
		         
		           var filteredData = params.filter() ? $filter('filter')($scope.tablas.pantallas, params.filter().myfilter) : data;
	               var orderedData = params.sorting() ?  $filter('orderBy')(filteredData, params.orderBy()) :
	                       data;
	                    params.total(orderedData.length); // set total for recalc pagination
		          $defer.resolve(orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count()));
		        },
	       $scope: { $data: {} }
		   
		    });
	
	
	
	$scope.guardarDatos =function(){
		
		if (parseInt($scope.parametros.edad) < 10){
			$scope.bandera.validate = true;
		}else{
			$scope.bandera.validate = false;
			$("#myModal").modal("hide");
		}
		
		
		
	}
	
	 $scope.activar = function(catalog){
		 $scope.parametros.edad = catalog.pantallaId;
		 $scope.parametros.pantalla = catalog.pantalla;
		 $("#myModal").modal("show");
	  }
	
	
	$scope.$watch("tablas.pantallas", function(){
	      $scope.tableParams.reload(); 
	      console.log($scope.tablas.pantallas);
	  })
	
			 
}]);






