
package views.html

/*1.2*/ import play.api.data.Form
/*2.2*/ import play.api.i18n.Messages
/*3.2*/ import play.api.mvc.RequestHeader
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder
/*6.2*/ import b3.inline.fieldConstructor

object changePassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[scala.Tuple2[String, String]], models.User, RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*8.2*/ (changePasswordForm: Form[(String, String)], user: models.User)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*8.166*/ ("""

"""), _display_( /*10.2*/ main(messages("change.password.title"), Some(user)) /*10.53*/ {
          _display_(Seq[Any](format.raw /*10.55*/ ("""
    """), format.raw /*11.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*12.18*/ messages("change.password")), format.raw /*12.45*/ ("""</legend>
        """), _display_( /*13.10*/ helper /*13.16*/ .form(action = controllers.routes.ChangePasswordController.submit, 'autocomplete -> "off") /*13.106*/ {
            _display_(Seq[Any](format.raw /*13.108*/ ("""
            """), format.raw /*14.13*/ ("""<p class="info">"""), _display_( /*14.30*/ messages("strong.password.info")), format.raw /*14.62*/ ("""</p>
            """), _display_( /*15.14*/ helper /*15.20*/ .CSRF.formField), format.raw /*15.35*/ ("""
            """), _display_( /*16.14*/ b3 /*16.16*/ .password(changePasswordForm("current-password"), '_hiddenLabel -> messages("current.password"), 'placeholder -> messages("current.password"), 'class -> "form-control input-lg")), format.raw /*16.193*/ ("""
            """), _display_( /*17.14*/ passwordStrength(changePasswordForm("new-password"), '_hiddenLabel -> messages("new.password"), 'placeholder -> messages("new.password"), 'class -> "form-control input-lg")), format.raw /*17.186*/ ("""
            """), format.raw /*18.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*20.112*/ messages("change")), format.raw /*20.130*/ ("""</button>
                </div>
            </div>
        """)))
          }), format.raw /*23.10*/ ("""
    """), format.raw /*24.5*/ ("""</fieldset>
""")))
        }), format.raw /*25.2*/ ("""
"""))
      }
    }
  }

  def render(changePasswordForm: Form[scala.Tuple2[String, String]], user: models.User, request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(changePasswordForm, user)(request, messages, webJarsUtil, assets)

  def f: ((Form[scala.Tuple2[String, String]], models.User) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (changePasswordForm, user) => (request, messages, webJarsUtil, assets) => apply(changePasswordForm, user)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:12 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/changePassword.scala.html
                  HASH: 61af0c1812e266bd858907952e256ae38a494d03
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|656->200|916->364|945->367|1005->418|1045->420|1077->425|1165->486|1213->513|1259->532|1274->538|1374->628|1415->630|1456->643|1500->660|1553->692|1598->710|1613->716|1649->731|1690->745|1701->747|1900->924|1941->938|2135->1110|2176->1123|2362->1281|2402->1299|2494->1360|2526->1365|2569->1378
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|14->8|19->8|21->10|21->10|21->10|22->11|23->12|23->12|24->13|24->13|24->13|24->13|25->14|25->14|25->14|26->15|26->15|26->15|27->16|27->16|27->16|28->17|28->17|29->18|31->20|31->20|34->23|35->24|36->25
                  -- GENERATED --
              */
