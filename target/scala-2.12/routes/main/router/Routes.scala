
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/adivek/Studia/ebusiness/myProject2/conf/routes
// @DATE:Tue Sep 04 21:30:04 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ApplicationController_14: controllers.ApplicationController,
  // @LINE:8
  SocialAuthController_13: controllers.SocialAuthController,
  // @LINE:10
  SignUpController_2: controllers.SignUpController,
  // @LINE:13
  SignInController_7: controllers.SignInController,
  // @LINE:16
  ForgotPasswordController_10: controllers.ForgotPasswordController,
  // @LINE:18
  ResetPasswordController_15: controllers.ResetPasswordController,
  // @LINE:20
  ChangePasswordController_11: controllers.ChangePasswordController,
  // @LINE:23
  ActivateAccountController_0: controllers.ActivateAccountController,
  // @LINE:26
  ProductController_5: controllers.ProductController,
  // @LINE:29
  CategoryController_6: controllers.CategoryController,
  // @LINE:31
  BasketController_9: controllers.BasketController,
  // @LINE:34
  OrderController_16: controllers.OrderController,
  // @LINE:36
  PaymentController_3: controllers.PaymentController,
  // @LINE:38
  ReviewController_4: controllers.ReviewController,
  // @LINE:40
  TypesController_1: controllers.TypesController,
  // @LINE:43
  AccessController_8: controllers.AccessController,
  // @LINE:49
  Assets_12: controllers.Assets,
  // @LINE:50
  webjars_Routes_0: webjars.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ApplicationController_14: controllers.ApplicationController,
    // @LINE:8
    SocialAuthController_13: controllers.SocialAuthController,
    // @LINE:10
    SignUpController_2: controllers.SignUpController,
    // @LINE:13
    SignInController_7: controllers.SignInController,
    // @LINE:16
    ForgotPasswordController_10: controllers.ForgotPasswordController,
    // @LINE:18
    ResetPasswordController_15: controllers.ResetPasswordController,
    // @LINE:20
    ChangePasswordController_11: controllers.ChangePasswordController,
    // @LINE:23
    ActivateAccountController_0: controllers.ActivateAccountController,
    // @LINE:26
    ProductController_5: controllers.ProductController,
    // @LINE:29
    CategoryController_6: controllers.CategoryController,
    // @LINE:31
    BasketController_9: controllers.BasketController,
    // @LINE:34
    OrderController_16: controllers.OrderController,
    // @LINE:36
    PaymentController_3: controllers.PaymentController,
    // @LINE:38
    ReviewController_4: controllers.ReviewController,
    // @LINE:40
    TypesController_1: controllers.TypesController,
    // @LINE:43
    AccessController_8: controllers.AccessController,
    // @LINE:49
    Assets_12: controllers.Assets,
    // @LINE:50
    webjars_Routes_0: webjars.Routes
  ) = this(errorHandler, ApplicationController_14, SocialAuthController_13, SignUpController_2, SignInController_7, ForgotPasswordController_10, ResetPasswordController_15, ChangePasswordController_11, ActivateAccountController_0, ProductController_5, CategoryController_6, BasketController_9, OrderController_16, PaymentController_3, ReviewController_4, TypesController_1, AccessController_8, Assets_12, webjars_Routes_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApplicationController_14, SocialAuthController_13, SignUpController_2, SignInController_7, ForgotPasswordController_10, ResetPasswordController_15, ChangePasswordController_11, ActivateAccountController_0, ProductController_5, CategoryController_6, BasketController_9, OrderController_16, PaymentController_3, ReviewController_4, TypesController_1, AccessController_8, Assets_12, webjars_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.view(token:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.submit(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/email/""" + "$" + """email<[^/]+>""", """controllers.ActivateAccountController.send(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/activate/""" + "$" + """token<[^/]+>""", """controllers.ActivateAccountController.activate(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getproducts""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getproduct/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getcategories""", """controllers.CategoryController.getCategories"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getbasket""", """controllers.BasketController.getBasket"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addToBasket""", """controllers.BasketController.addToBasket"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/deleteFromBasket/""" + "$" + """id<[^/]+>""", """controllers.BasketController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getorders""", """controllers.OrderController.getOrders"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addorder""", """controllers.OrderController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getpayments""", """controllers.PaymentController.getPayments"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addpayment""", """controllers.PaymentController.addPayment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/getreviews""", """controllers.ReviewController.getReviews"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addreview""", """controllers.ReviewController.addReview"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/gettypes""", """controllers.TypesController.getTypes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addtype""", """controllers.TypesController.addType"""),
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addcategory""", """controllers.AccessController.getAccess"""),
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addproduct""", """controllers.AccessController.getAccess"""),
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addToBasket""", """controllers.AccessController.getAccess"""),
    ("""OPTIONS""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/deleteFromBasket/""" + "$" + """id<[^/]+>""", """controllers.AccessController.getAccessLong(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    prefixed_webjars_Routes_0_36.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ApplicationController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index0_invoker = createInvoker(
    ApplicationController_14.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_signOut1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut1_invoker = createInvoker(
    ApplicationController_14.signOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      this.prefix + """signOut""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SocialAuthController_authenticate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate2_invoker = createInvoker(
    SocialAuthController_13.authenticate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SignUpController_view3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view3_invoker = createInvoker(
    SignUpController_2.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "view",
      Nil,
      "GET",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SignUpController_submit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit4_invoker = createInvoker(
    SignUpController_2.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignInController_view5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view5_invoker = createInvoker(
    SignInController_7.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SignInController_submit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit6_invoker = createInvoker(
    SignInController_7.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      this.prefix + """signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ForgotPasswordController_view7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_view7_invoker = createInvoker(
    ForgotPasswordController_10.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ForgotPasswordController_submit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_submit8_invoker = createInvoker(
    ForgotPasswordController_10.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/forgot""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ResetPasswordController_view9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_view9_invoker = createInvoker(
    ResetPasswordController_15.view(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "view",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ResetPasswordController_submit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_submit10_invoker = createInvoker(
    ResetPasswordController_15.submit(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "submit",
      Seq(classOf[java.util.UUID]),
      "POST",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ChangePasswordController_view11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_view11_invoker = createInvoker(
    ChangePasswordController_11.view,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "view",
      Nil,
      "GET",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ChangePasswordController_submit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_submit12_invoker = createInvoker(
    ChangePasswordController_11.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "submit",
      Nil,
      "POST",
      this.prefix + """password/change""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ActivateAccountController_send13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/email/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_send13_invoker = createInvoker(
    ActivateAccountController_0.send(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "send",
      Seq(classOf[String]),
      "GET",
      this.prefix + """account/email/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ActivateAccountController_activate14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/activate/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_activate14_invoker = createInvoker(
    ActivateAccountController_0.activate(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "activate",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """account/activate/""" + "$" + """token<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProductController_getProducts15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getproducts")))
  )
  private[this] lazy val controllers_ProductController_getProducts15_invoker = createInvoker(
    ProductController_5.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """api/getproducts""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProductController_getProduct16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getproduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct16_invoker = createInvoker(
    ProductController_5.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/getproduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProductController_addProduct17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct17_invoker = createInvoker(
    ProductController_5.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """api/addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CategoryController_getCategories18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getcategories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories18_invoker = createInvoker(
    CategoryController_6.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """api/getcategories""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_CategoryController_addCategory19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory19_invoker = createInvoker(
    CategoryController_6.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """api/addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_BasketController_getBasket20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getbasket")))
  )
  private[this] lazy val controllers_BasketController_getBasket20_invoker = createInvoker(
    BasketController_9.getBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "getBasket",
      Nil,
      "GET",
      this.prefix + """api/getbasket""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BasketController_addToBasket21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addToBasket")))
  )
  private[this] lazy val controllers_BasketController_addToBasket21_invoker = createInvoker(
    BasketController_9.addToBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "addToBasket",
      Nil,
      "POST",
      this.prefix + """api/addToBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BasketController_delete22_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/deleteFromBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BasketController_delete22_invoker = createInvoker(
    BasketController_9.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/deleteFromBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_OrderController_getOrders23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getorders")))
  )
  private[this] lazy val controllers_OrderController_getOrders23_invoker = createInvoker(
    OrderController_16.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """api/getorders""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_OrderController_addOrder24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder24_invoker = createInvoker(
    OrderController_16.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """api/addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PaymentController_getPayments25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getpayments")))
  )
  private[this] lazy val controllers_PaymentController_getPayments25_invoker = createInvoker(
    PaymentController_3.getPayments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayments",
      Nil,
      "GET",
      this.prefix + """api/getpayments""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PaymentController_addPayment26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addpayment")))
  )
  private[this] lazy val controllers_PaymentController_addPayment26_invoker = createInvoker(
    PaymentController_3.addPayment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPayment",
      Nil,
      "POST",
      this.prefix + """api/addpayment""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ReviewController_getReviews27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/getreviews")))
  )
  private[this] lazy val controllers_ReviewController_getReviews27_invoker = createInvoker(
    ReviewController_4.getReviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "getReviews",
      Nil,
      "GET",
      this.prefix + """api/getreviews""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ReviewController_addReview28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addreview")))
  )
  private[this] lazy val controllers_ReviewController_addReview28_invoker = createInvoker(
    ReviewController_4.addReview,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewController",
      "addReview",
      Nil,
      "POST",
      this.prefix + """api/addreview""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_TypesController_getTypes29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/gettypes")))
  )
  private[this] lazy val controllers_TypesController_getTypes29_invoker = createInvoker(
    TypesController_1.getTypes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TypesController",
      "getTypes",
      Nil,
      "GET",
      this.prefix + """api/gettypes""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_TypesController_addType30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addtype")))
  )
  private[this] lazy val controllers_TypesController_addType30_invoker = createInvoker(
    TypesController_1.addType,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TypesController",
      "addType",
      Nil,
      "POST",
      this.prefix + """api/addtype""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AccessController_getAccess31_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addcategory")))
  )
  private[this] lazy val controllers_AccessController_getAccess31_invoker = createInvoker(
    AccessController_8.getAccess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessController",
      "getAccess",
      Nil,
      "OPTIONS",
      this.prefix + """api/addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_AccessController_getAccess32_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addproduct")))
  )
  private[this] lazy val controllers_AccessController_getAccess32_invoker = createInvoker(
    AccessController_8.getAccess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessController",
      "getAccess",
      Nil,
      "OPTIONS",
      this.prefix + """api/addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AccessController_getAccess33_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addToBasket")))
  )
  private[this] lazy val controllers_AccessController_getAccess33_invoker = createInvoker(
    AccessController_8.getAccess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessController",
      "getAccess",
      Nil,
      "OPTIONS",
      this.prefix + """api/addToBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_AccessController_getAccessLong34_route = Route("OPTIONS",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/deleteFromBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AccessController_getAccessLong34_invoker = createInvoker(
    AccessController_8.getAccessLong(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessController",
      "getAccessLong",
      Seq(classOf[Long]),
      "OPTIONS",
      this.prefix + """api/deleteFromBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Assets_versioned35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned35_invoker = createInvoker(
    Assets_12.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:50
  private[this] val prefixed_webjars_Routes_0_36 = Include(webjars_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "webjars"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ApplicationController_index0_route(params) =>
      call { 
        controllers_ApplicationController_index0_invoker.call(ApplicationController_14.index)
      }
  
    // @LINE:7
    case controllers_ApplicationController_signOut1_route(params) =>
      call { 
        controllers_ApplicationController_signOut1_invoker.call(ApplicationController_14.signOut)
      }
  
    // @LINE:8
    case controllers_SocialAuthController_authenticate2_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate2_invoker.call(SocialAuthController_13.authenticate(provider))
      }
  
    // @LINE:10
    case controllers_SignUpController_view3_route(params) =>
      call { 
        controllers_SignUpController_view3_invoker.call(SignUpController_2.view)
      }
  
    // @LINE:11
    case controllers_SignUpController_submit4_route(params) =>
      call { 
        controllers_SignUpController_submit4_invoker.call(SignUpController_2.submit)
      }
  
    // @LINE:13
    case controllers_SignInController_view5_route(params) =>
      call { 
        controllers_SignInController_view5_invoker.call(SignInController_7.view)
      }
  
    // @LINE:14
    case controllers_SignInController_submit6_route(params) =>
      call { 
        controllers_SignInController_submit6_invoker.call(SignInController_7.submit)
      }
  
    // @LINE:16
    case controllers_ForgotPasswordController_view7_route(params) =>
      call { 
        controllers_ForgotPasswordController_view7_invoker.call(ForgotPasswordController_10.view)
      }
  
    // @LINE:17
    case controllers_ForgotPasswordController_submit8_route(params) =>
      call { 
        controllers_ForgotPasswordController_submit8_invoker.call(ForgotPasswordController_10.submit)
      }
  
    // @LINE:18
    case controllers_ResetPasswordController_view9_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_view9_invoker.call(ResetPasswordController_15.view(token))
      }
  
    // @LINE:19
    case controllers_ResetPasswordController_submit10_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_submit10_invoker.call(ResetPasswordController_15.submit(token))
      }
  
    // @LINE:20
    case controllers_ChangePasswordController_view11_route(params) =>
      call { 
        controllers_ChangePasswordController_view11_invoker.call(ChangePasswordController_11.view)
      }
  
    // @LINE:21
    case controllers_ChangePasswordController_submit12_route(params) =>
      call { 
        controllers_ChangePasswordController_submit12_invoker.call(ChangePasswordController_11.submit)
      }
  
    // @LINE:23
    case controllers_ActivateAccountController_send13_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActivateAccountController_send13_invoker.call(ActivateAccountController_0.send(email))
      }
  
    // @LINE:24
    case controllers_ActivateAccountController_activate14_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ActivateAccountController_activate14_invoker.call(ActivateAccountController_0.activate(token))
      }
  
    // @LINE:26
    case controllers_ProductController_getProducts15_route(params) =>
      call { 
        controllers_ProductController_getProducts15_invoker.call(ProductController_5.getProducts)
      }
  
    // @LINE:27
    case controllers_ProductController_getProduct16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProduct16_invoker.call(ProductController_5.getProduct(id))
      }
  
    // @LINE:28
    case controllers_ProductController_addProduct17_route(params) =>
      call { 
        controllers_ProductController_addProduct17_invoker.call(ProductController_5.addProduct)
      }
  
    // @LINE:29
    case controllers_CategoryController_getCategories18_route(params) =>
      call { 
        controllers_CategoryController_getCategories18_invoker.call(CategoryController_6.getCategories)
      }
  
    // @LINE:30
    case controllers_CategoryController_addCategory19_route(params) =>
      call { 
        controllers_CategoryController_addCategory19_invoker.call(CategoryController_6.addCategory)
      }
  
    // @LINE:31
    case controllers_BasketController_getBasket20_route(params) =>
      call { 
        controllers_BasketController_getBasket20_invoker.call(BasketController_9.getBasket)
      }
  
    // @LINE:32
    case controllers_BasketController_addToBasket21_route(params) =>
      call { 
        controllers_BasketController_addToBasket21_invoker.call(BasketController_9.addToBasket)
      }
  
    // @LINE:33
    case controllers_BasketController_delete22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BasketController_delete22_invoker.call(BasketController_9.delete(id))
      }
  
    // @LINE:34
    case controllers_OrderController_getOrders23_route(params) =>
      call { 
        controllers_OrderController_getOrders23_invoker.call(OrderController_16.getOrders)
      }
  
    // @LINE:35
    case controllers_OrderController_addOrder24_route(params) =>
      call { 
        controllers_OrderController_addOrder24_invoker.call(OrderController_16.addOrder)
      }
  
    // @LINE:36
    case controllers_PaymentController_getPayments25_route(params) =>
      call { 
        controllers_PaymentController_getPayments25_invoker.call(PaymentController_3.getPayments)
      }
  
    // @LINE:37
    case controllers_PaymentController_addPayment26_route(params) =>
      call { 
        controllers_PaymentController_addPayment26_invoker.call(PaymentController_3.addPayment)
      }
  
    // @LINE:38
    case controllers_ReviewController_getReviews27_route(params) =>
      call { 
        controllers_ReviewController_getReviews27_invoker.call(ReviewController_4.getReviews)
      }
  
    // @LINE:39
    case controllers_ReviewController_addReview28_route(params) =>
      call { 
        controllers_ReviewController_addReview28_invoker.call(ReviewController_4.addReview)
      }
  
    // @LINE:40
    case controllers_TypesController_getTypes29_route(params) =>
      call { 
        controllers_TypesController_getTypes29_invoker.call(TypesController_1.getTypes)
      }
  
    // @LINE:41
    case controllers_TypesController_addType30_route(params) =>
      call { 
        controllers_TypesController_addType30_invoker.call(TypesController_1.addType)
      }
  
    // @LINE:43
    case controllers_AccessController_getAccess31_route(params) =>
      call { 
        controllers_AccessController_getAccess31_invoker.call(AccessController_8.getAccess)
      }
  
    // @LINE:44
    case controllers_AccessController_getAccess32_route(params) =>
      call { 
        controllers_AccessController_getAccess32_invoker.call(AccessController_8.getAccess)
      }
  
    // @LINE:45
    case controllers_AccessController_getAccess33_route(params) =>
      call { 
        controllers_AccessController_getAccess33_invoker.call(AccessController_8.getAccess)
      }
  
    // @LINE:46
    case controllers_AccessController_getAccessLong34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AccessController_getAccessLong34_invoker.call(AccessController_8.getAccessLong(id))
      }
  
    // @LINE:49
    case controllers_Assets_versioned35_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned35_invoker.call(Assets_12.versioned(file))
      }
  
    // @LINE:50
    case prefixed_webjars_Routes_0_36(handler) => handler
  }
}
