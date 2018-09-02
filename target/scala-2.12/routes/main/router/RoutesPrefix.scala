
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adivek/Studia/ebusiness/myProject2/conf/routes
// @DATE:Sun Sep 02 22:59:55 CEST 2018


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
