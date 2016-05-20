
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/play/git/sis-fornecedor-play/conf/routes
// @DATE:Fri May 20 12:55:17 BRT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseSegmentos(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "segmentos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:27
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "segmentos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def find(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "segmentos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:24
    def all(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "segmentos")
    }
  
    // @LINE:26
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "segmentos")
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:5
    def options(path:String): Call = {
      import ReverseRouteContext.empty
      Call("OPTIONS", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
    }
  
  }

  // @LINE:14
  class ReverseUsuarios(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "usuarios/login")
    }
  
  }

  // @LINE:17
  class ReverseFornecedores(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:20
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def find(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def all(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores")
    }
  
    // @LINE:19
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "fornecedores")
    }
  
  }


}