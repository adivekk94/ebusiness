
package views.txt.emails

/*1.2*/ import play.api.i18n.Messages

object signUp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with _root_.play.twirl.api.Template3[models.User, String, Messages, play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply /*3.2*/ (user: models.User, url: String)(implicit messages: Messages): play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*3.63*/ ("""
"""), _display_( /*4.2*/ messages("email.sign.up.hello", user.name.getOrElse("user"))), format.raw /*4.62*/ ("""

"""), _display_( /*6.2*/ messages("email.sign.up.txt.text", url)), format.raw /*6.41*/ ("""
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
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/emails/signUp.scala.txt
                  HASH: 98e25310caa4973ebb569176afaaa73c814c2a5a
                  MATRIX: 34->1|386->33|541->94|568->96|648->156|676->159|735->198
                  LINES: 4->1|9->3|14->3|15->4|15->4|17->6|17->6
                  -- GENERATED --
              */
