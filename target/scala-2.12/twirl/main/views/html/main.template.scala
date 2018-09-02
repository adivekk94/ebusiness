
package views.html

/*1.2*/ import play.api.i18n.Messages
/*2.2*/ import play.api.mvc.RequestHeader
/*3.2*/ import play.twirl.api.Html
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String, Option[models.User], Html, RequestHeader, Messages, AssetsFinder, WebJarsUtil, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*7.2*/ (title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*7.167*/ ("""

"""), format.raw /*9.1*/ ("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""), _display_( /*15.59*/ assets /*15.65*/ .path("images/favicon.png")), format.raw /*15.92*/ ("""">
        <title>"""), _display_( /*16.17*/ title), format.raw /*16.22*/ ("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        """), _display_( /*19.10*/ Html(webJarsUtil.css("bootstrap.min.css"))), format.raw /*19.52*/ ("""
        """), _display_( /*20.10*/ Html(webJarsUtil.css("bootstrap-theme.min.css"))), format.raw /*20.58*/ ("""
        """), format.raw /*21.9*/ ("""<link rel="stylesheet" href=""""), _display_( /*21.39*/ assets /*21.45*/ .path("styles/main.css")), format.raw /*21.69*/ ("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""), _display_( /*33.48*/ messages("toggle.navigation")), format.raw /*33.77*/ ("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""), _display_( /*38.52*/ controllers /*38.63*/ .routes.ApplicationController.index), format.raw /*38.98*/ ("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""), _display_( /*42.39*/ controllers /*42.50*/ .routes.ApplicationController.index), format.raw /*42.85*/ ("""">"""), _display_( /*42.88*/ messages("home")), format.raw /*42.104*/ ("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """), _display_( /*46.26*/ user /*46.30*/ .map /*46.34*/ { u =>
          _display_(Seq[Any](format.raw /*46.41*/ ("""
                            """), format.raw /*47.29*/ ("""<li><a href=""""), _display_( /*47.43*/ controllers /*47.54*/ .routes.ApplicationController.index), format.raw /*47.89*/ ("""">"""), _display_( /*47.92*/ u /*47.93*/ .name), format.raw /*47.98*/ ("""</a></li>
                            """), _display_( /*48.30*/ if (u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID) /*48.124*/ {
            _display_(Seq[Any](format.raw /*48.126*/ ("""
                                """), format.raw /*49.33*/ ("""<li><a href=""""), _display_( /*49.47*/ controllers /*49.58*/ .routes.ChangePasswordController.view), format.raw /*49.95*/ ("""">"""), _display_( /*49.98*/ messages("change.password")), format.raw /*49.125*/ ("""</a></li>
                            """)))
          }), format.raw /*50.30*/ ("""
                            """), format.raw /*51.29*/ ("""<li><a href=""""), _display_( /*51.43*/ controllers /*51.54*/ .routes.ApplicationController.signOut), format.raw /*51.91*/ ("""">"""), _display_( /*51.94*/ messages("sign.out")), format.raw /*51.114*/ ("""</a></li>
                        """)))
        } /*52.26*/ .getOrElse /*52.36*/ {
          _display_(Seq[Any](format.raw /*52.38*/ ("""
                            """), format.raw /*53.29*/ ("""<li><a href=""""), _display_( /*53.43*/ controllers /*53.54*/ .routes.SignInController.view), format.raw /*53.83*/ ("""">"""), _display_( /*53.86*/ messages("sign.in")), format.raw /*53.105*/ ("""</a></li>
                            <li><a href=""""), _display_( /*54.43*/ controllers /*54.54*/ .routes.SignUpController.view), format.raw /*54.83*/ ("""">"""), _display_( /*54.86*/ messages("sign.up")), format.raw /*54.105*/ ("""</a></li>
                        """)))
        }), format.raw /*55.26*/ ("""
                    """), format.raw /*56.21*/ ("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """), _display_( /*62.18*/ request /*62.25*/ .flash.get("error").map /*62.48*/ { msg =>
          _display_(Seq[Any](format.raw /*62.57*/ ("""
                    """), format.raw /*63.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*65.34*/ messages("error")), format.raw /*65.51*/ ("""</strong> """), _display_( /*65.62*/ msg), format.raw /*65.65*/ ("""
                    """), format.raw /*66.21*/ ("""</div>
                """)))
        }), format.raw /*67.18*/ ("""
                """), _display_( /*68.18*/ request /*68.25*/ .flash.get("info").map /*68.47*/ { msg =>
          _display_(Seq[Any](format.raw /*68.56*/ ("""
                    """), format.raw /*69.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*71.34*/ messages("info")), format.raw /*71.50*/ ("""</strong> """), _display_( /*71.61*/ msg), format.raw /*71.64*/ ("""
                    """), format.raw /*72.21*/ ("""</div>
                """)))
        }), format.raw /*73.18*/ ("""
                """), _display_( /*74.18*/ request /*74.25*/ .flash.get("success").map /*74.50*/ { msg =>
          _display_(Seq[Any](format.raw /*74.59*/ ("""
                    """), format.raw /*75.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*77.34*/ messages("success")), format.raw /*77.53*/ ("""</strong> """), _display_( /*77.64*/ msg), format.raw /*77.67*/ ("""
                    """), format.raw /*78.21*/ ("""</div>
                """)))
        }), format.raw /*79.18*/ ("""
                """), _display_( /*80.18*/ content), format.raw /*80.25*/ ("""
            """), format.raw /*81.13*/ ("""</div>
        </main>
        """), _display_( /*83.10*/ Html(webJarsUtil.script("jquery.min.js"))), format.raw /*83.51*/ ("""
        """), _display_( /*84.10*/ Html(webJarsUtil.script("bootstrap.min.js"))), format.raw /*84.54*/ ("""
        """), format.raw /*85.9*/ ("""<script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""), _display_( /*86.23*/ assets /*86.29*/ .path("javascripts/zxcvbnShim.js")), format.raw /*86.63*/ (""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title: String, user: Option[models.User], content: Html, request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title, user)(content)(request, messages, assets, webJarsUtil)

  def f: ((String, Option[models.User]) => (Html) => (RequestHeader, Messages, AssetsFinder, WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title, user) => (content) => (request, messages, assets, webJarsUtil) => apply(title, user)(content)(request, messages, assets, webJarsUtil)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:11 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/main.scala.html
                  HASH: 44cff197f2fd302fef8353f1c21d49fc4e0b7c84
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|591->166|852->331|880->333|1179->605|1194->611|1242->638|1288->657|1314->662|1588->909|1651->951|1688->961|1757->1009|1793->1018|1850->1048|1865->1054|1910->1078|2630->1771|2680->1800|2961->2054|2981->2065|3037->2100|3259->2295|3279->2306|3335->2341|3365->2344|3403->2360|3653->2583|3666->2587|3679->2591|3724->2598|3781->2627|3822->2641|3842->2652|3898->2687|3928->2690|3938->2691|3964->2696|4030->2735|4134->2829|4175->2831|4236->2864|4277->2878|4297->2889|4355->2926|4385->2929|4434->2956|4504->2995|4561->3024|4602->3038|4622->3049|4680->3086|4710->3089|4752->3109|4806->3144|4825->3154|4865->3156|4922->3185|4963->3199|4983->3210|5033->3239|5063->3242|5104->3261|5183->3313|5203->3324|5253->3353|5283->3356|5324->3375|5390->3410|5439->3431|5629->3594|5645->3601|5677->3624|5724->3633|5773->3654|5974->3828|6012->3845|6050->3856|6074->3859|6123->3880|6178->3904|6223->3922|6239->3929|6270->3951|6317->3960|6366->3981|6565->4153|6602->4169|6640->4180|6664->4183|6713->4204|6768->4228|6813->4246|6829->4253|6863->4278|6910->4287|6959->4308|7161->4483|7201->4502|7239->4513|7263->4516|7312->4537|7367->4561|7412->4579|7440->4586|7481->4599|7540->4631|7602->4672|7639->4682|7704->4726|7740->4735|7875->4843|7890->4849|7945->4883
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|18->7|20->9|26->15|26->15|26->15|27->16|27->16|30->19|30->19|31->20|31->20|32->21|32->21|32->21|32->21|44->33|44->33|49->38|49->38|49->38|53->42|53->42|53->42|53->42|53->42|57->46|57->46|57->46|57->46|58->47|58->47|58->47|58->47|58->47|58->47|58->47|59->48|59->48|59->48|60->49|60->49|60->49|60->49|60->49|60->49|61->50|62->51|62->51|62->51|62->51|62->51|62->51|63->52|63->52|63->52|64->53|64->53|64->53|64->53|64->53|64->53|65->54|65->54|65->54|65->54|65->54|66->55|67->56|73->62|73->62|73->62|73->62|74->63|76->65|76->65|76->65|76->65|77->66|78->67|79->68|79->68|79->68|79->68|80->69|82->71|82->71|82->71|82->71|83->72|84->73|85->74|85->74|85->74|85->74|86->75|88->77|88->77|88->77|88->77|89->78|90->79|91->80|91->80|92->81|94->83|94->83|95->84|95->84|96->85|97->86|97->86|97->86
                  -- GENERATED --
              */
