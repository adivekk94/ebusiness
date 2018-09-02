
package views.html

/*1.2*/ import play.api.data.Form
/*2.2*/ import play.api.i18n.Messages
/*3.2*/ import play.api.mvc.RequestHeader
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder
/*6.2*/ import java.util.UUID

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[String], UUID, RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*8.2*/ (form: Form[String], token: UUID)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*8.136*/ ("""

"""), _display_( /*10.2*/ main(messages("reset.password.title")) /*10.40*/ {
          _display_(Seq[Any](format.raw /*10.42*/ ("""
    """), format.raw /*11.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*12.18*/ messages("reset.password")), format.raw /*12.44*/ ("""</legend>
        """), _display_( /*13.10*/ helper /*13.16*/ .form(action = controllers.routes.ResetPasswordController.submit(token), 'autocomplete -> "off") /*13.112*/ {
            _display_(Seq[Any](format.raw /*13.114*/ ("""
            """), format.raw /*14.13*/ ("""<p class="info">"""), _display_( /*14.30*/ messages("strong.password.info")), format.raw /*14.62*/ ("""</p>
            """), _display_( /*15.14*/ helper /*15.20*/ .CSRF.formField), format.raw /*15.35*/ ("""
            """), _display_( /*16.14*/ passwordStrength(form("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")), format.raw /*16.160*/ ("""
            """), format.raw /*17.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*19.112*/ messages("reset")), format.raw /*19.129*/ ("""</button>
                </div>
            </div>
        """)))
          }), format.raw /*22.10*/ ("""
    """), format.raw /*23.5*/ ("""</fieldset>
""")))
        }), format.raw /*24.2*/ ("""
"""))
      }
    }
  }

  def render(form: Form[String], token: UUID, request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(form, token)(request, messages, webJarsUtil, assets)

  def f: ((Form[String], UUID) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (form, token) => (request, messages, webJarsUtil, assets) => apply(form, token)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:12 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/resetPassword.scala.html
                  HASH: 3719c0afe67524296fc855b82b75664e6961eee7
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|614->188|844->322|873->325|920->363|960->365|992->370|1080->431|1127->457|1173->476|1188->482|1294->578|1335->580|1376->593|1420->610|1473->642|1518->660|1533->666|1569->681|1610->695|1778->841|1819->854|2005->1012|2044->1029|2136->1090|2168->1095|2211->1108
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|19->8|21->10|21->10|21->10|22->11|23->12|23->12|24->13|24->13|24->13|24->13|25->14|25->14|25->14|26->15|26->15|26->15|27->16|27->16|28->17|30->19|30->19|33->22|34->23|35->24
                  -- GENERATED --
              */
