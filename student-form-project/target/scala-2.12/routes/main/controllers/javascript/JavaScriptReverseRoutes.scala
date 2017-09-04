
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/register-student-form/student-form-project/conf/routes
// @DATE:Mon Sep 04 16:38:04 EAT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def postIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.postIndex",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def getIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getIndex",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0))])})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
