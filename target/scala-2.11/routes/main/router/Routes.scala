
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/play/git/sis-fornecedor-play/conf/routes
// @DATE:Fri May 20 12:55:17 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_3: controllers.Application,
  // @LINE:11
  Assets_2: controllers.Assets,
  // @LINE:14
  Usuarios_0: controllers.Usuarios,
  // @LINE:17
  Fornecedores_4: controllers.Fornecedores,
  // @LINE:24
  Segmentos_1: controllers.Segmentos,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_3: controllers.Application,
    // @LINE:11
    Assets_2: controllers.Assets,
    // @LINE:14
    Usuarios_0: controllers.Usuarios,
    // @LINE:17
    Fornecedores_4: controllers.Fornecedores,
    // @LINE:24
    Segmentos_1: controllers.Segmentos
  ) = this(errorHandler, Application_3, Assets_2, Usuarios_0, Fornecedores_4, Segmentos_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, Assets_2, Usuarios_0, Fornecedores_4, Segmentos_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """$path<.+>""", """controllers.Application.options(path:String)"""),
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios/login""", """controllers.Usuarios.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores""", """controllers.Fornecedores.all()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""", """controllers.Fornecedores.find(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores""", """controllers.Fornecedores.save()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""", """controllers.Fornecedores.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/$id<[^/]+>""", """controllers.Fornecedores.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmentos""", """controllers.Segmentos.all()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmentos/$id<[^/]+>""", """controllers.Segmentos.find(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmentos""", """controllers.Segmentos.save()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmentos/$id<[^/]+>""", """controllers.Segmentos.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """segmentos/$id<[^/]+>""", """controllers.Segmentos.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_options0_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("path", """.+""",false)))
  )
  private[this] lazy val controllers_Application_options0_invoker = createInvoker(
    Application_3.options(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "options",
      Seq(classOf[String]),
      "OPTIONS",
      """""",
      this.prefix + """$path<.+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    Application_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Usuarios_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios/login")))
  )
  private[this] lazy val controllers_Usuarios_login3_invoker = createInvoker(
    Usuarios_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuarios",
      "login",
      Nil,
      "POST",
      """ Usuários""",
      this.prefix + """usuarios/login"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Fornecedores_all4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores")))
  )
  private[this] lazy val controllers_Fornecedores_all4_invoker = createInvoker(
    Fornecedores_4.all(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Fornecedores",
      "all",
      Nil,
      "GET",
      """ Fornecedores""",
      this.prefix + """fornecedores"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Fornecedores_find5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Fornecedores_find5_invoker = createInvoker(
    Fornecedores_4.find(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Fornecedores",
      "find",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """fornecedores/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Fornecedores_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores")))
  )
  private[this] lazy val controllers_Fornecedores_save6_invoker = createInvoker(
    Fornecedores_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Fornecedores",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """fornecedores"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Fornecedores_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Fornecedores_update7_invoker = createInvoker(
    Fornecedores_4.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Fornecedores",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """fornecedores/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Fornecedores_delete8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Fornecedores_delete8_invoker = createInvoker(
    Fornecedores_4.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Fornecedores",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """fornecedores/$id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Segmentos_all9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmentos")))
  )
  private[this] lazy val controllers_Segmentos_all9_invoker = createInvoker(
    Segmentos_1.all(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Segmentos",
      "all",
      Nil,
      "GET",
      """ Segmentos""",
      this.prefix + """segmentos"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Segmentos_find10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmentos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Segmentos_find10_invoker = createInvoker(
    Segmentos_1.find(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Segmentos",
      "find",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """segmentos/$id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Segmentos_save11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmentos")))
  )
  private[this] lazy val controllers_Segmentos_save11_invoker = createInvoker(
    Segmentos_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Segmentos",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """segmentos"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Segmentos_update12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmentos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Segmentos_update12_invoker = createInvoker(
    Segmentos_1.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Segmentos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """segmentos/$id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Segmentos_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("segmentos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Segmentos_delete13_invoker = createInvoker(
    Segmentos_1.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Segmentos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """segmentos/$id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_options0_route(params) =>
      call(params.fromPath[String]("path", None)) { (path) =>
        controllers_Application_options0_invoker.call(Application_3.options(path))
      }
  
    // @LINE:8
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(Application_3.index())
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_Usuarios_login3_route(params) =>
      call { 
        controllers_Usuarios_login3_invoker.call(Usuarios_0.login())
      }
  
    // @LINE:17
    case controllers_Fornecedores_all4_route(params) =>
      call { 
        controllers_Fornecedores_all4_invoker.call(Fornecedores_4.all())
      }
  
    // @LINE:18
    case controllers_Fornecedores_find5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Fornecedores_find5_invoker.call(Fornecedores_4.find(id))
      }
  
    // @LINE:19
    case controllers_Fornecedores_save6_route(params) =>
      call { 
        controllers_Fornecedores_save6_invoker.call(Fornecedores_4.save())
      }
  
    // @LINE:20
    case controllers_Fornecedores_update7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Fornecedores_update7_invoker.call(Fornecedores_4.update(id))
      }
  
    // @LINE:21
    case controllers_Fornecedores_delete8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Fornecedores_delete8_invoker.call(Fornecedores_4.delete(id))
      }
  
    // @LINE:24
    case controllers_Segmentos_all9_route(params) =>
      call { 
        controllers_Segmentos_all9_invoker.call(Segmentos_1.all())
      }
  
    // @LINE:25
    case controllers_Segmentos_find10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Segmentos_find10_invoker.call(Segmentos_1.find(id))
      }
  
    // @LINE:26
    case controllers_Segmentos_save11_route(params) =>
      call { 
        controllers_Segmentos_save11_invoker.call(Segmentos_1.save())
      }
  
    // @LINE:27
    case controllers_Segmentos_update12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Segmentos_update12_invoker.call(Segmentos_1.update(id))
      }
  
    // @LINE:28
    case controllers_Segmentos_delete13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Segmentos_delete13_invoker.call(Segmentos_1.delete(id))
      }
  }
}