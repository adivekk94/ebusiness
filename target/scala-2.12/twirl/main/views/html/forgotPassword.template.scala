
package views.html

/*1.2*/ import play.api.data.Form
/*2.2*/ import play.api.i18n.Messages
/*3.2*/ import play.api.mvc.RequestHeader
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder
/*6.2*/ import b3.inline.fieldConstructor

object forgotPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[String], RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*8.2*/ (forgotPasswordForm: Form[String])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*8.137*/ ("""

"""), _display_( /*10.2*/ main(messages("forgot.password.title")) /*10.41*/ {
          _display_(Seq[Any](format.raw /*10.43*/ ("""
    """), format.raw /*11.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*12.18*/ messages("forgot.password")), format.raw /*12.45*/ ("""</legend>
        """), _display_( /*13.10*/ helper /*13.16*/ .form(action = controllers.routes.ForgotPasswordController.submit(), 'autocomplete -> "off") /*13.108*/ {
            _display_(Seq[Any](format.raw /*13.110*/ ("""
            """), format.raw /*14.13*/ ("""<p class="info">"""), _display_( /*14.30*/ messages("forgot.password.info")), format.raw /*14.62*/ ("""</p>
            """), _display_( /*15.14*/ helper /*15.20*/ .CSRF.formField), format.raw /*15.35*/ ("""
            """), _display_( /*16.14*/ b3 /*16.16*/ .text(forgotPasswordForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")), format.raw /*16.156*/ ("""
            """), format.raw /*17.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*19.112*/ messages("send")), format.raw /*19.128*/ ("""</button>
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

  def render(forgotPasswordForm: Form[String], request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(forgotPasswordForm)(request, messages, webJarsUtil, assets)

  def f: ((Form[String]) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (forgotPasswordForm) => (request, messages, webJarsUtil, assets) => apply(forgotPasswordForm)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:11 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/forgotPassword.scala.html
                  HASH: 9088b348f1799042d2bfc7f630a99d53b602802a
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|622->200|853->335|882->338|930->377|970->379|1002->384|1090->445|1138->472|1184->491|1199->497|1301->589|1342->591|1383->604|1427->621|1480->653|1525->671|1540->677|1576->692|1617->706|1628->708|1790->848|1831->861|2017->1019|2055->1035|2147->1096|2179->1101|2222->1114
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|19->8|21->10|21->10|21->10|22->11|23->12|23->12|24->13|24->13|24->13|24->13|25->14|25->14|25->14|26->15|26->15|26->15|27->16|27->16|27->16|28->17|30->19|30->19|33->22|34->23|35->24
                  -- GENERATED --
              */
