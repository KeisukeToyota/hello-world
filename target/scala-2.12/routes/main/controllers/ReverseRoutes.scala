
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/toyotakeisuke/workspace/KeisukeToyota/hello-world/conf/routes
// @DATE:Sat Jun 29 14:47:00 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHelloController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get(name:Option[String]): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("name", name)))))
    }
  
  }


}
