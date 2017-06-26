
angular.module('webappApp')
.controller ('WelcomeCtrl',['$scope','$http','ngTableParams','$filter', function ($scope,$http,ngTableParams,$filter){

	console.log("Cargando angular...");
	  $scope.listas = {};
	  $scope.formulario ={};
	  $scope.tablas ={};
	  $scope.tablas.pantallas = [];
	  
	  
	  $http({
			method: "POST",
			url:"http://localhost:8080/testSpringItc/services/login/roles"
		}).success(function(data){
			 $scope.listas.roles = data;
			 $scope.listas.selectRolesValue = $scope.listas.roles[1];
			 
			console.log("roles..");
			console.log($scope.listas);
		
		   });
	  
	  
	  $http({
			method: "POST",
			url:"http://localhost:8080/testSpringItc/services/login/pantallas"
		}).success(function(data){
			console.log("pantallas");
			$scope.tablas.pantallas = data;
			console.log(data);
		
		   });
	  
	  
	  
	  $scope.cambio = function(){
		  
		  console.log("Valor Selecciondo");
		  console.log($scope.listas.selectRolesValue);
		  console.log($scope.listas.selectRolesValue.dsRol);
		  console.log($scope.listas.selectRolesValue.rolId);
		  $scope.formulario.nombre = $scope.listas.selectRolesValue.dsRol;
		  
	  }
	  
	  
	  $scope.filters = {myfilter: ''}; 
	  $scope.filters2 = {myfilter: 'Reglas'};
	  
	  
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
	
	
	
	
	$scope.tableparams2 = new ngTableParams({
        page: 1,            // show first page
        count: 10,
        filter: $scope.filters2,
        sorting: {	
        	     // initial sorting

        }
    }, {
      count:[], //here put empty counts
     total: $scope.tablas.pantallas.length, // length of data
        getData: function($defer, params) {
         
            var filteredData = params.filter() ? $filter('filter')($scope.tablas.pantallas, params.filter().myfilter) : data;
           var orderedData = params.sorting() ?
                   $filter('orderBy')(filteredData, params.orderBy()) :
                   data;
                params.total(orderedData.length); // set total for recalc pagination
          $defer.resolve(orderedData.slice((params.page() - 1) * params.count(), params.page() * params.count()));
        },
   $scope: { $data: {} }
   
    });
	
	
	$scope.$watch("tablas.pantallas", function(){
	      $scope.tableParams.reload(); 
	      console.log($scope.tablas.pantallas);
	  })
	  
	  
	  $scope.$watch("tablas.pantallas", function(){
	      $scope.tableparams2.reload(); 
	      console.log($scope.tablas.pantallas);
	  })
	
	
	
	
		  
	  $scope.activar = function(catalog){
		  console.log(catalog);
		  $scope.nombre = catalog.menu;
		  
		  alert(JSON.stringify(catalog));
	  }
	
	  
	  
	  
	  
			 
}]);






