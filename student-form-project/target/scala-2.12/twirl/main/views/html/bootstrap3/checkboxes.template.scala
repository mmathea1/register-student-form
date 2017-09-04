
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

object checkboxes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Field,String,Map[String, Boolean],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", checkboxMap: Map[String, Boolean], help:String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10" id=""""),_display_(/*5.33*/field/*5.38*/.id),format.raw/*5.41*/("""">
      """),_display_(/*6.8*/for((checkboxName, isChecked) <- checkboxMap) yield /*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
        """),format.raw/*7.9*/("""<label class="checkbox-inline">
          <input
            type="checkbox"
            name=""""),_display_(/*10.20*/(field.name + "[]")),format.raw/*10.39*/(""""
            id=""""),_display_(/*11.18*/checkboxName),format.raw/*11.30*/(""""
            value=""""),_display_(/*12.21*/checkboxName),format.raw/*12.33*/(""""
            """),_display_(/*13.14*/if(isChecked)/*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""checked""")))}),format.raw/*13.37*/(""">
          """),_display_(/*14.12*/checkboxName),format.raw/*14.24*/("""
        """),format.raw/*15.9*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,checkboxMap:Map[String, Boolean],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,checkboxMap,help)

  def f:((Field,String,Map[String, Boolean],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,checkboxMap,help) => apply(field,label,checkboxMap,help)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:43 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/bootstrap3/checkboxes.scala.html
                  HASH: 5536616e7b856e5df255a01f18bff161431f96cf
                  MATRIX: 998->1|1188->96|1220->102|1270->126|1297->145|1336->147|1376->157|1454->209|1467->214|1490->217|1519->220|1544->225|1612->267|1625->272|1648->275|1684->286|1744->331|1783->333|1819->343|1945->442|1985->461|2032->481|2065->493|2115->516|2148->528|2191->544|2213->557|2253->559|2292->567|2333->581|2366->593|2403->603|2450->620|2485->628|2538->654|2563->658|2631->699|2696->743
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|45->13|45->13|46->14|46->14|47->15|48->16|49->17|49->17|49->17|50->18|50->18
                  -- GENERATED --
              */
          