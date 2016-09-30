app.controller('MainController',function($scope,$http) {
  $http.get("/files/customer.json")
    .success(function(response) {$scope.customers = response;});

    $scope.view="col-sm-6 col-md-4 col-lg-3";

    $scope.list = function(){
      $scope.view="col-xs-12";
    }

    $scope.card = function(){
      $scope.view="col-sm-6 col-md-4 col-lg-3";
    }

    $scope.editedCustomer = {};

    $scope.showModal = function($index){
      $scope.$index = $index;
      //$scope.customerName = $scope.customers[$index].name;
      //$scope.customerAddress = $scope.customers[$index].address;
      //$scope.customerGender = $scope.customers[$index].gender;
      //$scope.customerOrders = $scope.customers[$index].orders;
      angular.copy($scope.customers[$index],$scope.editedCustomer);
    }

    $scope.updateView = function(){
      angular.copy($scope.editedCustomer , $scope.customers[$scope.$index]);
    }

    $scope.deleteCard = function($index){
      $scope.customers.splice($index,1);
    }

});
