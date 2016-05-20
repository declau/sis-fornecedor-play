/**
 * Created by cassiano on 12/01/16.
 */

var appFornecedores = angular.module('app.fornecedores', []);

appFornecedores.controller("FornecedorIndexController", ['$scope', '$location', 'FornecedorFactory', 'SweetAlert', function ($scope, $location, FornecedorFactory, SweetAlert) {

    $scope.fornecedores = [];

    $scope.filtro = {
        'chave': "",
        'valor': ""
    };

    $scope.atualizarLista = function() {
        FornecedorFactory.query(

            $scope.filtro,

            function(response) {
                $scope.fornecedores = response;
            },

            function(response) {
                console.log(response);
            }
        );
    };

    $scope.atualizarLista();

    $scope.removeFornecedor = function (idFornecedor) {

        SweetAlert.swal({
                title: "Excluir?",
                text: "Tem certeza que deseja excluir o fornecedor?",
                type: "error",
                showCancelButton: true,
                cancelButtonText: "Cancelar",
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "Sim",
                closeOnConfirm: true
            },
            function(isConfirmed){
                if(isConfirmed) {
                    FornecedorFactory.delete({'id': idFornecedor}).$promise.then(

                        function(response) {
                            $scope.atualizarLista()
                        },

                        function(response) {
                            console.log(response)
                        }
                    );
                }
            });

    };

}]);

appFornecedores.controller("FornecedorNewController", ['$scope', '$location', 'FornecedorFactory', 'SegmentoFactory','segmentos', function($scope, $location, FornecedorFactory, SegmentoFactory, segmentos) {

    $scope.fornecedor = {
        'ativo': false,
        'segmento': null
    };

    $scope.segmentos = segmentos;

    SegmentoFactory.query(

        function(response) {
            $scope.segmentos = response;
        },

        function(response) {
            console.log(response);
        }

    );

    $scope.save = function () {
        $scope.fornecedor.dtCadastro = new Date();
        FornecedorFactory.save($scope.fornecedor).$promise.then(

            function(response) {
                $scope.fornecedor = {};
                $location.path('/fornecedores');
            },

            function(response) {
                console.log(response.data.message);
                alert(response.data.message);
            }
        );
    };

}]);

appFornecedores.controller("FornecedorEditController", ['$scope', '$location', 'FornecedorFactory', 'fornecedor', 'segmentos', function($scope, $location, FornecedorFactory, fornecedor, segmentos) {

    $scope.fornecedor = fornecedor;

    $scope.segmentos = segmentos;

    $scope.update = function () {
        $scope.fornecedor.dtAtualizacao = new Date();
        FornecedorFactory.update({'id':$scope.fornecedor.id}, $scope.fornecedor).$promise.then(

            function(response) {
                $scope.fornecedor = {};
                $location.path('/fornecedores');
            },

            function(response) {
                console.log(response);
            }
        );
    };

}]);

appFornecedores.filter('linkEmail', ['$sce',function ($sce) {
    return function (email) {
        return $sce.trustAsHtml('<a href="mailto:'+email+'">' + email + '</a>');
    } ;
}]);

appFornecedores.factory('FornecedorFactory', ['$http', '$q', '$resource', function($http, $q, $resource) {

    return $resource(application_url + "fornecedores/:id",{},  {'update':{method:'PUT' }});

}]);
