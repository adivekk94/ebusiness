
package views.txt.emails

/*1.2*/ import play.api.i18n.Messages

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template3[models.User, String, Messages, play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply /*3.2*/ (user: models.User, url: String)(implicit messages: Messages): play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*3.63*/ ("""
"""), _display_( /*4.2*/ messages("email.reset.password.hello", user.name.getOrElse("user"))), format.raw /*4.69*/ ("""

"""), _display_( /*6.2*/ messages("email.reset.password.txt.text", url)), format.raw /*6.48*/ ("""
"""))
      }
    }
  }

  def render(user: models.User, url: String, messages: Messages): play.twirl.api.TxtFormat.Appendable = apply(user, url)(messages)

  def f: ((models.User, String) => (Messages) => play.twirl.api.TxtFormat.Appendable) = (user, url) => (messages) => apply(user, url)(messages)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:12 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/emails/resetPassword.scala.txt
                  HASH: 20e040ce32e5d1d63dcf02402aef41c710d1b8db
                  MATRIX: 34->1|393->33|548->94|575->96|662->163|690->166|756->212
                  LINES: 4->1|9->3|14->3|15->4|15->4|17->6|17->6
                  -- GENERATED --
              */
