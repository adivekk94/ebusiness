
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adivek/Studia/ebusiness/myProject2/conf/routes
// @DATE:Tue Sep 04 21:55:49 CEST 2018


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
