
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>Student registration form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
              <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
      <![endif]-->
    </head>
    <body>
    <div class = "navbar navbar-inverse" role ="navigation">
    <div class= "container">
    <div class = "navbar-header">
     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">Student registration</a>
    </div>
    </div>
    </div>
        """),format.raw/*37.32*/("""
         """),_display_(/*38.11*/content),format.raw/*38.18*/("""
    """),format.raw/*39.5*/("""<script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.versioned("javascripts/main.js")),format.raw/*42.69*/("""" type="text/javascript"></script>
         <!-- Enable tooltips. Used primarily to validate that JQuery + Bootstrap JS are loaded. Remove this script if you don't want tooltips. -->
    <script type="text/javascript">
    jQuery(function ($) """),format.raw/*45.25*/("""{"""),format.raw/*45.26*/("""
        """),format.raw/*46.9*/("""$("[rel='tooltip']").tooltip()
    """),format.raw/*47.5*/("""}"""),format.raw/*47.6*/(""");
    </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 31 18:12:02 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/main.scala.html
                  HASH: d6503a90d820d287742e083c8b45bbfb0a2fadaa
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1794->699|1809->705|1872->746|1961->808|1976->814|2037->853|2981->1860|3020->1872|3048->1879|3081->1885|3290->2067|3305->2073|3366->2113|3640->2359|3669->2360|3706->2370|3769->2406|3797->2407
                  LINES: 33->7|38->7|40->9|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|67->37|68->38|68->38|69->39|72->42|72->42|72->42|75->45|75->45|76->46|77->47|77->47
                  -- GENERATED --
              */
          