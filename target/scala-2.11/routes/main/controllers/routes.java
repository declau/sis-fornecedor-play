
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/play/git/sis-fornecedor-play/conf/routes
// @DATE:Fri May 20 12:55:17 BRT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSegmentos Segmentos = new controllers.ReverseSegmentos(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUsuarios Usuarios = new controllers.ReverseUsuarios(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFornecedores Fornecedores = new controllers.ReverseFornecedores(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSegmentos Segmentos = new controllers.javascript.ReverseSegmentos(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUsuarios Usuarios = new controllers.javascript.ReverseUsuarios(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFornecedores Fornecedores = new controllers.javascript.ReverseFornecedores(RoutesPrefix.byNamePrefix());
  }

}
