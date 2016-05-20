
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/denis/Desktop/play/git/sis-fornecedor-play/conf/routes
// @DATE:Fri May 20 12:55:17 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
