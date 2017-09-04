
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

object select extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Field,String,Map[String, Boolean],Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", optionMap: Map[String, Boolean], isMultiple: Boolean, help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.117*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="">Please select a value</option>""")))}),format.raw/*11.89*/("""
        """),_display_(/*12.10*/for((optionName, isSelected) <- optionMap) yield /*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
          """),format.raw/*13.11*/("""<option id=""""),_display_(/*13.24*/optionName),format.raw/*13.34*/("""" value=""""),_display_(/*13.44*/optionName),format.raw/*13.54*/("""" """),_display_(/*13.57*/if(isSelected)/*13.71*/ {_display_(Seq[Any](format.raw/*13.73*/("""selected""")))}),format.raw/*13.82*/(""">"""),_display_(/*13.84*/optionName),format.raw/*13.94*/("""</option>
        """)))}),format.raw/*14.10*/("""
      """),format.raw/*15.7*/("""</select>
      <span class="help-block">"""),_display_(/*16.33*/help),format.raw/*16.37*/("""</span>
      <span class="help-block">"""),_display_(/*17.33*/{field.error.map { error => error.message }}),format.raw/*17.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isMultiple:Boolean,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple,help)

  def f:((Field,String,Map[String, Boolean],Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple,help) => apply(field,label,optionMap,isMultiple,help)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:44 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/bootstrap3/select.scala.html
                  HASH: efff8f3a76e029ab14db68745d6fd4201afaa492
                  MATRIX: 1002->1|1213->116|1245->122|1295->146|1322->165|1361->167|1401->177|1479->229|1492->234|1515->237|1544->240|1569->245|1692->342|1705->347|1728->350|1772->368|1794->382|1824->385|1854->406|1866->411|1895->413|1908->418|1936->424|1975->436|1998->450|2038->452|2089->472|2128->484|2152->499|2192->501|2285->563|2323->574|2381->616|2421->618|2461->630|2501->643|2532->653|2569->663|2600->673|2630->676|2653->690|2693->692|2733->701|2762->703|2793->713|2844->733|2879->741|2949->784|2974->788|3042->829|3107->873
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|36->4|36->4|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|47->15|48->16|48->16|49->17|49->17
                  -- GENERATED --
              */
          