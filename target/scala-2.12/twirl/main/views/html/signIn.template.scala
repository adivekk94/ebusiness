
package views.html

/*1.2*/ import play.api.data.Form
/*2.2*/ import play.api.i18n.Messages
/*3.2*/ import play.api.mvc.RequestHeader
/*4.2*/ import org.webjars.play.WebJarsUtil
/*5.2*/ import controllers.AssetsFinder
/*6.2*/ import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/ import forms.SignInForm.Data
/*8.2*/ import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data], SocialProviderRegistry, RequestHeader, Messages, WebJarsUtil, AssetsFinder, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*10.2*/ (signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*10.168*/ ("""

"""), _display_( /*12.2*/ main(messages("sign.in.title")) /*12.33*/ {
          _display_(Seq[Any](format.raw /*12.35*/ ("""
    """), format.raw /*13.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*14.18*/ messages("sign.in.credentials")), format.raw /*14.49*/ ("""</legend>
        """), _display_( /*15.10*/ helper /*15.16*/ .form(action = controllers.routes.SignInController.submit()) /*15.76*/ {
            _display_(Seq[Any](format.raw /*15.78*/ ("""
            """), _display_( /*16.14*/ helper /*16.20*/ .CSRF.formField), format.raw /*16.35*/ ("""
            """), _display_( /*17.14*/ b3 /*17.16*/ .email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")), format.raw /*17.149*/ ("""
            """), _display_( /*18.14*/ b3 /*18.16*/ .password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")), format.raw /*18.161*/ ("""
            """), _display_( /*19.14*/ b3 /*19.16*/ .checkbox(signInForm("rememberMe"), '_text -> messages("remember.me"), 'checked -> true)), format.raw /*19.104*/ ("""
            """), format.raw /*20.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*22.112*/ messages("sign.in")), format.raw /*22.131*/ ("""</button>
                </div>
            </div>
        """)))
          }), format.raw /*25.10*/ ("""

        """), format.raw /*27.9*/ ("""<div>
            <p class="not-a-member">"""), _display_( /*28.38*/ messages("not.a.member")), format.raw /*28.62*/ (""" """), format.raw /*28.63*/ ("""<a href=""""), _display_( /*28.73*/ controllers /*28.84*/ .routes.SignUpController.view), format.raw /*28.113*/ ("""">"""), _display_( /*28.116*/ messages("sign.up.now")), format.raw /*28.139*/ ("""</a> | <a href=""""), _display_( /*28.156*/ controllers /*28.167*/ .routes.ForgotPasswordController.view()), format.raw /*28.206*/ ("""" title=""""), _display_( /*28.216*/ messages("forgot.your.password")), format.raw /*28.248*/ ("""">"""), _display_( /*28.251*/ messages("forgot.your.password")), format.raw /*28.283*/ ("""</a></p>
        </div>

        """), _display_( /*31.10*/ if (socialProviders.providers.nonEmpty) /*31.48*/ {
            _display_(Seq[Any](format.raw /*31.50*/ ("""
            """), format.raw /*32.13*/ ("""<div class="social-providers">
                <p>"""), _display_( /*33.21*/ messages("or.use.social")), format.raw /*33.46*/ ("""</p>
                <div>
                """), _display_( /*35.18*/ for (p <- socialProviders.providers) yield /*35.53*/ {
              _display_(Seq[Any](format.raw /*35.55*/ ("""
                    """), format.raw /*36.21*/ ("""<a href=""""), _display_( /*36.31*/ controllers /*36.42*/ .routes.SocialAuthController.authenticate(p.id)), format.raw /*36.89*/ ("""" class="provider """), _display_( /*36.108*/ p /*36.109*/ .id), format.raw /*36.112*/ ("""" title=""""), _display_( /*36.122*/ messages(p.id)), format.raw /*36.136*/ (""""><img src=""""), _display_( /*36.149*/ assets /*36.155*/ .path(s"images/providers/${p.id}.png")), format.raw /*36.193*/ ("""" width="64px" height="64px" alt=""""), _display_( /*36.228*/ messages(p.id)), format.raw /*36.242*/ (""""></a>
                """)))
            }), format.raw /*37.18*/ ("""
                """), format.raw /*38.17*/ ("""</div>
            </div>
        """)))
          }), format.raw /*40.10*/ ("""

    """), format.raw /*42.5*/ ("""</fieldset>
""")))
        }), format.raw /*43.2*/ ("""
"""))
      }
    }
  }

  def render(signInForm: Form[Data], socialProviders: SocialProviderRegistry, request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm, socialProviders)(request, messages, webJarsUtil, assets)

  def f: ((Form[Data], SocialProviderRegistry) => (RequestHeader, Messages, WebJarsUtil, AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm, socialProviders) => (request, messages, webJarsUtil, assets) => apply(signInForm, socialProviders)(request, messages, webJarsUtil, assets)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:12 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/signIn.scala.html
                  HASH: 2e7896ba026d6fa034fd45bf6cab2883fb9788de
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|300->237|336->267|751->303|1014->469|1043->472|1083->503|1123->505|1155->510|1243->571|1295->602|1341->621|1356->627|1425->687|1465->689|1506->703|1521->709|1557->724|1598->738|1609->740|1764->873|1805->887|1816->889|1983->1034|2024->1048|2035->1050|2145->1138|2186->1151|2372->1309|2413->1328|2505->1389|2542->1399|2612->1442|2657->1466|2686->1467|2723->1477|2743->1488|2794->1517|2825->1520|2870->1543|2915->1560|2936->1571|2997->1610|3035->1620|3089->1652|3120->1655|3174->1687|3235->1721|3282->1759|3322->1761|3363->1774|3441->1825|3487->1850|3558->1894|3609->1929|3649->1931|3698->1952|3735->1962|3755->1973|3823->2020|3870->2039|3881->2040|3906->2043|3944->2053|3980->2067|4021->2080|4037->2086|4097->2124|4160->2159|4196->2173|4251->2197|4296->2214|4362->2249|4395->2255|4438->2268
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|16->10|21->10|23->12|23->12|23->12|24->13|25->14|25->14|26->15|26->15|26->15|26->15|27->16|27->16|27->16|28->17|28->17|28->17|29->18|29->18|29->18|30->19|30->19|30->19|31->20|33->22|33->22|36->25|38->27|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|39->28|42->31|42->31|42->31|43->32|44->33|44->33|46->35|46->35|46->35|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|47->36|48->37|49->38|51->40|53->42|54->43
                  -- GENERATED --
              */
