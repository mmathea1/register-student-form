
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mingina/Workspace/register-student-form/student-form-project/conf/routes
// @DATE:Mon Sep 04 16:38:04 EAT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def postIndex(): Call = {
      
      Call("POST", _prefix)
    }
  
    // @LINE:6
    def getIndex(id:Long = 0): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(id == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
