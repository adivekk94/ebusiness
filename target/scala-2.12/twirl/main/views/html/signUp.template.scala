
package views.html

/*1.2*/ import play.api.data.Form
/*2.2*/ import play.api.i18n.Messages
/*3.2*/ import play.api.mvc.RequestHeader
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder
/*6.2*/ import forms.SignUpForm.Data
/*7.2*/ import b3.inline.fieldConstructor

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[Data], RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*9.2*/ (signUpForm: Form[Data])(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*9.127*/ ("""

"""), _display_( /*11.2*/ main(messages("sign.up.title")) /*11.33*/ {
          _display_(Seq[Any](format.raw /*11.35*/ ("""
    """), format.raw /*12.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*13.18*/ messages("sign.up.account")), format.raw /*13.45*/ ("""</legend>
        """), _display_( /*14.10*/ helper /*14.16*/ .form(action = controllers.routes.SignUpController.submit()) /*14.76*/ {
            _display_(Seq[Any](format.raw /*14.78*/ ("""
            """), _display_( /*15.14*/ helper /*15.20*/ .CSRF.formField), format.raw /*15.35*/ ("""
            """), _display_( /*16.14*/ b3 /*16.16*/ .text(signUpForm("firstName"), '_hiddenLabel -> messages("first.name"), 'placeholder -> messages("first.name"), 'class -> "form-control input-lg")), format.raw /*16.162*/ ("""
            """), _display_( /*17.14*/ b3 /*17.16*/ .text(signUpForm("lastName"), '_hiddenLabel -> messages("last.name"), 'placeholder -> messages("last.name"), 'class -> "form-control input-lg")), format.raw /*17.159*/ ("""
            """), _display_( /*18.14*/ b3 /*18.16*/ .text(signUpForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")), format.raw /*18.148*/ ("""
            """), _display_( /*19.14*/ passwordStrength(signUpForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")), format.raw /*19.166*/ ("""
            """), format.raw /*20.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*22.112*/ messages("sign.up")), format.raw /*22.131*/ ("""</button>
                </div>
            </div>
            <div class="sign-in-now">
                <p>"""), _display_( /*26.21*/ messages("already.a.member")), format.raw /*26.49*/ (""" """), format.raw /*26.50*/ ("""<a href=""""), _display_( /*26.60*/ controllers /*26.71*/ .routes.SignInController.view), format.raw /*26.100*/ ("""">"""), _display_( /*26.103*/ messages("sign.in.now")), format.raw /*26.126*/ ("""</a></p>
            </div>
        """)))
          }), format.raw /*28.10*/ ("""
    """), format.raw /*29.5*/ ("""</fieldset>
""")))
        }), format.raw /*30.2*/ ("""
"""))
      }
    }
  }

  def render(signUpForm: Form[Data], request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request, messages, webJarsUtil, assets)

  def f: ((Form[Data]) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request, messages, webJarsUtil, assets) => apply(signUpForm)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:12 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/signUp.scala.html
                  HASH: 9d29aa26bf0fa78afe3ddda0a138865466be8d84
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|257->194|648->230|869->355|898->358|938->389|978->391|1010->396|1098->457|1146->484|1192->503|1207->509|1276->569|1316->571|1357->585|1372->591|1408->606|1449->620|1460->622|1628->768|1669->782|1680->784|1845->927|1886->941|1897->943|2051->1075|2092->1089|2266->1241|2307->1254|2493->1412|2534->1431|2671->1541|2720->1569|2749->1570|2786->1580|2806->1591|2857->1620|2888->1623|2933->1646|3001->1683|3033->1688|3076->1701
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|15->9|20->9|22->11|22->11|22->11|23->12|24->13|24->13|25->14|25->14|25->14|25->14|26->15|26->15|26->15|27->16|27->16|27->16|28->17|28->17|28->17|29->18|29->18|29->18|30->19|30->19|31->20|33->22|33->22|37->26|37->26|37->26|37->26|37->26|37->26|37->26|37->26|39->28|40->29|41->30
                  -- GENERATED --
              */
