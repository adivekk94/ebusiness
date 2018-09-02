
package views.html

/*1.2*/ import play.api.i18n.Messages
/*2.2*/ import play.api.mvc.RequestHeader
/*3.2*/ import org.webjars.play.WebJarsUtil
/*4.2*/ import controllers.AssetsFinder

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User, RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*6.2*/ (user: models.User)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*6.122*/ ("""

"""), _display_( /*8.2*/ main(messages("home.title"), Some(user)) /*8.42*/ {
          _display_(Seq[Any](format.raw /*8.44*/ ("""
    """), format.raw /*9.5*/ ("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""), _display_( /*12.35*/ messages("welcome.signed.in")), format.raw /*12.64*/ ("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""), _display_( /*14.28*/ user /*14.32*/ .avatarURL.getOrElse(assets.path("images/silhouette.png"))), format.raw /*14.90*/ ("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*21.50*/ messages("first.name")), format.raw /*21.72*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*21.107*/ user /*21.111*/ .firstName.getOrElse("None")), format.raw /*21.139*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*24.50*/ messages("last.name")), format.raw /*24.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*24.106*/ user /*24.110*/ .lastName.getOrElse("None")), format.raw /*24.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*27.50*/ messages("full.name")), format.raw /*27.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*27.106*/ user /*27.110*/ .fullName.getOrElse("None")), format.raw /*27.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*30.50*/ messages("email")), format.raw /*30.67*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*30.102*/ user /*30.106*/ .email.getOrElse("None")), format.raw /*30.130*/ ("""</p>
                </div>
            </div>
        </div>
    </div>
""")))
        }), format.raw /*35.2*/ ("""
"""))
      }
    }
  }

  def render(user: models.User, request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(user)(request, messages, webJarsUtil, assets)

  def f: ((models.User) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request, messages, webJarsUtil, assets) => apply(user)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:11 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/home.scala.html
                  HASH: 97ce0defc8ecd211a6cc02def0a8429d9cfe531c
                  MATRIX: 28->1|65->32|106->67|149->104|537->138|753->258|781->261|829->301|868->303|899->308|1067->449|1117->478|1223->557|1236->561|1315->619|1582->859|1625->881|1688->916|1702->920|1752->948|1890->1059|1932->1080|1995->1115|2009->1119|2058->1146|2196->1257|2238->1278|2301->1313|2315->1317|2364->1344|2502->1455|2540->1472|2603->1507|2617->1511|2663->1535|2767->1609
                  LINES: 4->1|5->2|6->3|7->4|12->6|17->6|19->8|19->8|19->8|20->9|23->12|23->12|25->14|25->14|25->14|32->21|32->21|32->21|32->21|32->21|35->24|35->24|35->24|35->24|35->24|38->27|38->27|38->27|38->27|38->27|41->30|41->30|41->30|41->30|41->30|46->35
                  -- GENERATED --
              */
