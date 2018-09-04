
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adivek/Studia/ebusiness/myProject2/conf/routes
// @DATE:Tue Sep 04 21:55:49 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:6
package controllers {

  // @LINE:49
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseSignInController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn")
    }
  
    // @LINE:14
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signIn")
    }
  
  }

  // @LINE:43
  class ReverseAccessController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getAccess(): Call = {
    
      () match {
      
        // @LINE:43
        case ()  =>
          
          Call("OPTIONS", _prefix + { _defaultPrefix } + "api/addcategory")
      
      }
    
    }
  
    // @LINE:46
    def getAccessLong(id:Long): Call = {
      
      Call("OPTIONS", _prefix + { _defaultPrefix } + "api/deleteFromBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:8
  class ReverseSocialAuthController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def authenticate(provider:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("provider", provider)))
    }
  
  }

  // @LINE:18
  class ReverseResetPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def submit(token:java.util.UUID): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:18
    def view(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/reset/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
  }

  // @LINE:6
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def signOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signOut")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:36
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def addPayment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addpayment")
    }
  
    // @LINE:36
    def getPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getpayments")
    }
  
  }

  // @LINE:23
  class ReverseActivateAccountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def activate(token:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/activate/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("token", token)))
    }
  
    // @LINE:23
    def send(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "account/email/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
  }

  // @LINE:29
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addcategory")
    }
  
    // @LINE:29
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getcategories")
    }
  
  }

  // @LINE:26
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addproduct")
    }
  
    // @LINE:27
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getproduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getproducts")
    }
  
  }

  // @LINE:38
  class ReverseReviewController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addReview(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addreview")
    }
  
    // @LINE:38
    def getReviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getreviews")
    }
  
  }

  // @LINE:16
  class ReverseForgotPasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
    // @LINE:17
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/forgot")
    }
  
  }

  // @LINE:20
  class ReverseChangePasswordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "password/change")
    }
  
    // @LINE:21
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "password/change")
    }
  
  }

  // @LINE:34
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addorder")
    }
  
    // @LINE:34
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getorders")
    }
  
  }

  // @LINE:40
  class ReverseTypesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def addType(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addtype")
    }
  
    // @LINE:40
    def getTypes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/gettypes")
    }
  
  }

  // @LINE:31
  class ReverseBasketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def addToBasket(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addToBasket")
    }
  
    // @LINE:31
    def getBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/getbasket")
    }
  
    // @LINE:33
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/deleteFromBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:10
  class ReverseSignUpController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def view(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp")
    }
  
    // @LINE:11
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signUp")
    }
  
  }


}
