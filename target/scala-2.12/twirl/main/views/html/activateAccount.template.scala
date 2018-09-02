
package views.html

/*1.2*/ import play.api.i18n.Messages
/*2.2*/ import play.api.mvc.RequestHeader
/*3.2*/ import play.twirl.api.Html
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder

object activateAccount extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String, RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*7.2*/ (email: String)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*7.118*/ ("""

"""), _display_( /*9.2*/ main(messages("activate.account.title")) /*9.42*/ {
          _display_(Seq[Any](format.raw /*9.44*/ ("""
    """), format.raw /*10.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*11.18*/ messages("activate.account")), format.raw /*11.46*/ ("""</legend>
        <div class="info">
            <p>"""), _display_( /*13.17*/ messages("activate.account.text1")), format.raw /*13.51*/ ("""</p>
            <p><b>"""), _display_( /*14.20*/ email), format.raw /*14.25*/ ("""</b></p>
            <p>"""), _display_( /*15.17*/ messages("activate.account.text2")), format.raw /*15.51*/ ("""</p>
            <p>"""), _display_( /*16.17*/ Html(messages("activate.account.text3", controllers.routes.ActivateAccountController.send(helper.urlEncode(email))))), format.raw /*16.133*/ ("""</p>
        </div>
    </fieldset>
""")))
        }), format.raw /*19.2*/ ("""
"""))
      }
    }
  }

  def render(email: String, request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(email)(request, messages, webJarsUtil, assets)

  def f: ((String) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (email) => (request, messages, webJarsUtil, assets) => apply(email)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:11 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/activateAccount.scala.html
                  HASH: 356d86f8c7db8fefed34145864c856737584f3a3
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|577->166|789->282|817->285|865->325|904->327|936->332|1024->393|1073->421|1153->474|1208->508|1259->532|1285->537|1337->562|1392->596|1440->617|1578->733|1645->770
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|18->7|20->9|20->9|20->9|21->10|22->11|22->11|24->13|24->13|25->14|25->14|26->15|26->15|27->16|27->16|30->19
                  -- GENERATED --
              */
