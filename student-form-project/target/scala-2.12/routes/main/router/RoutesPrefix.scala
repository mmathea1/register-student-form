
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/register-student-form/student-form-project/conf/routes
// @DATE:Thu Aug 31 17:07:05 EAT 2017


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
