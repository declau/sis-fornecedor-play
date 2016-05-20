
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/play/git/sis-fornecedor-play/conf/routes
// @DATE:Fri May 20 12:55:17 BRT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseSegmentos(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Segmentos.delete",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "segmentos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:27
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Segmentos.update",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "segmentos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:25
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Segmentos.find",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "segmentos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:24
    def all: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Segmentos.all",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "segmentos"})
        }
      """
    )
  
    // @LINE:26
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Segmentos.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "segmentos"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:5
    def options: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.options",
      """
        function(path) {
          return _wA({method:"OPTIONS", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseUsuarios(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuarios.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/login"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseFornecedores(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Fornecedores.delete",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Fornecedores.update",
      """
        function(id) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:18
    def find: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Fornecedores.find",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:17
    def all: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Fornecedores.all",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
        }
      """
    )
  
    // @LINE:19
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Fornecedores.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
        }
      """
    )
  
  }


}