
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/toyotakeisuke/workspace/KeisukeToyota/hello-world/conf/routes
// @DATE:Sat Jun 29 14:47:00 JST 2019


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
