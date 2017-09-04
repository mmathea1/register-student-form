
package views.html.bootstrap3

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

object radiobuttons extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Field,String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", buttonNameList: List[String], help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.93*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div id=""""),_display_(/*5.15*/(field.id + "s")),format.raw/*5.31*/("""" class="col-sm-10" >
      """),_display_(/*6.8*/for(buttonName <- buttonNameList) yield /*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
      """),format.raw/*7.7*/("""<label class="radio-inline">
        <input
          type="radio"
          name=""""),_display_(/*10.18*/field/*10.23*/.name),format.raw/*10.28*/(""""
          id=""""),_display_(/*11.16*/buttonName),format.raw/*11.26*/(""""
          value=""""),_display_(/*12.19*/buttonName),format.raw/*12.29*/(""""
          """),_display_(/*13.12*/if(buttonName == field.value.getOrElse(""))/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""checked""")))}),format.raw/*13.65*/(""" """),format.raw/*13.66*/("""/>
        """),_display_(/*14.10*/buttonName),format.raw/*14.20*/("""
      """),format.raw/*15.7*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,buttonNameList:List[String],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,buttonNameList,help)

  def f:((Field,String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,buttonNameList,help) => apply(field,label,buttonNameList,help)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:44 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/bootstrap3/radiobuttons.scala.html
                  HASH: 2bcdfff0a9f9404bfc946f77f2cb1203da61f0ca
                  MATRIX: 992->1|1178->92|1210->98|1260->122|1287->141|1326->143|1366->153|1444->205|1457->210|1480->213|1509->216|1534->221|1584->245|1620->261|1675->291|1723->324|1762->326|1796->334|1910->421|1924->426|1950->431|1995->449|2026->459|2074->480|2105->490|2146->504|2198->547|2238->549|2277->557|2306->558|2346->571|2377->581|2412->589|2459->606|2494->614|2547->640|2572->644|2640->685|2705->729
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|37->5|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|45->13|45->13|45->13|46->14|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18
                  -- GENERATED --
              */
          