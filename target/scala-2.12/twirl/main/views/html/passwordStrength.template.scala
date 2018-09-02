
package views.html

/*1.2*/ import play.api.data.Field
/*2.2*/ import play.api.i18n.MessagesProvider
/*3.2*/ import b3.inline.fieldConstructor

object passwordStrength extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, _root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Field, Array[scala.Tuple2[Symbol, Any]], MessagesProvider, play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply /*5.2*/ (field: Field, options: (Symbol, Any)*)(implicit messagesProvider: MessagesProvider): play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

        Seq[Any](format.raw /*5.86*/ ("""
"""), format.raw /*6.1*/ ("""<section>
  """), _display_( /*7.4*/ b3 /*7.6*/ .password(field, (Symbol("data-pwd"), "true") +: options: _*)), format.raw /*7.66*/ ("""

  """), format.raw /*9.3*/ ("""<meter max="4" id="password-strength-meter"></meter>
  <p id="password-strength-text"></p>
</section>
"""))
      }
    }
  }

  def render(field: Field, options: Array[scala.Tuple2[Symbol, Any]], messagesProvider: MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(field, options: _*)(messagesProvider)

  def f: ((Field, Array[scala.Tuple2[Symbol, Any]]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (field, options) => (messagesProvider) => apply(field, options: _*)(messagesProvider)

  def ref: this.type = this

}

/*
                  -- GENERATED --
                  DATE: Thu Jul 12 19:58:11 CEST 2018
                  SOURCE: /home/adivek/Studia/ebusiness/scala-play-slick-oauth2-react-example/app/views/passwordStrength.scala.html
                  HASH: efa2c52113debce72f800b386ae424f5c9689f34
                  MATRIX: 28->1|62->29|107->68|505->104|684->188|711->189|749->202|758->204|838->264|868->268
                  LINES: 4->1|5->2|6->3|11->5|16->5|17->6|18->7|18->7|18->7|20->9
                  -- GENERATED --
              */
