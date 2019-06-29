
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/toyotakeisuke/workspace/KeisukeToyota/hello-world/conf/routes
// @DATE:Sat Jun 29 14:47:00 JST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseHelloController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloController.get",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Option[String]]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
  }


}
