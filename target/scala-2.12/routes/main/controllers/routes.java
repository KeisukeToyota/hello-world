
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/toyotakeisuke/workspace/KeisukeToyota/hello-world/conf/routes
// @DATE:Sat Jun 29 14:47:00 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHelloController HelloController = new controllers.ReverseHelloController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHelloController HelloController = new controllers.javascript.ReverseHelloController(RoutesPrefix.byNamePrefix());
  }

}
