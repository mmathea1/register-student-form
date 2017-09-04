
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[views.formdata.StudentFormData],Map[String, Boolean],List[String],Map[String, Boolean],Map[String, Boolean],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(studentForm: Form[views.formdata.StudentFormData],
hobbies: Map[String, Boolean],
levels: List[String],
gpa: Map[String, Boolean],
majors: Map[String, Boolean]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import helper._


Seq[Any](format.raw/*5.30*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Index")/*9.15*/ {_display_(Seq[Any](format.raw/*9.17*/("""
  """),format.raw/*10.3*/("""<div class = "container">
  <div class = "well">
  	"""),_display_(/*12.5*/form(routes.HomeController.postIndex(), 'class -> "form-horizonal")/*12.72*/{_display_(Seq[Any](format.raw/*12.73*/("""
  		"""),_display_(/*13.6*/fieldset(studentForm, hobbies, levels, gpa, majors)),format.raw/*13.57*/("""
  	""")))}),format.raw/*14.5*/("""
  """),format.raw/*15.3*/("""</div>
  
  	"""),_display_(/*17.5*/if(flash.containsKey("success"))/*17.37*/{_display_(Seq[Any](format.raw/*17.38*/("""
  	"""),format.raw/*18.4*/("""<div class ="well">
  		<div id="success-message" class="text-success">
  			"""),_display_(/*20.7*/flash/*20.12*/.get("success")),format.raw/*20.27*/("""
  		"""),format.raw/*21.5*/("""</div>
  	</div>	
  	""")))}),format.raw/*23.5*/("""
  	
  	"""),_display_(/*25.5*/if(flash.containsKey("error"))/*25.35*/{_display_(Seq[Any](format.raw/*25.36*/("""
  		"""),format.raw/*26.5*/("""<div class = "well">
  			<div id ="error-message" class ="text-danger">
  				"""),_display_(/*28.8*/flash/*28.13*/.get("error")),format.raw/*28.26*/("""
  			"""),format.raw/*29.6*/("""</div>
  		</div>
  	""")))}),format.raw/*31.5*/("""
  """),format.raw/*32.3*/("""</div>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(studentForm:Form[views.formdata.StudentFormData],hobbies:Map[String, Boolean],levels:List[String],gpa:Map[String, Boolean],majors:Map[String, Boolean]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm,hobbies,levels,gpa,majors)

  def f:((Form[views.formdata.StudentFormData],Map[String, Boolean],List[String],Map[String, Boolean],Map[String, Boolean]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm,hobbies,levels,gpa,majors) => apply(studentForm,hobbies,levels,gpa,majors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 16:34:38 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/index.scala.html
                  HASH: 787364057976d1802cff3018e7c993260f79ac18
                  MATRIX: 1054->1|1292->171|1337->166|1367->188|1395->191|1416->204|1455->206|1486->210|1567->265|1643->332|1682->333|1715->340|1787->391|1823->397|1854->401|1896->417|1937->449|1976->450|2008->455|2114->535|2128->540|2164->555|2197->561|2251->585|2288->596|2327->626|2366->627|2399->633|2507->715|2521->720|2555->733|2589->740|2643->764|2674->768|2713->777
                  LINES: 28->1|35->7|38->5|40->8|41->9|41->9|41->9|42->10|44->12|44->12|44->12|45->13|45->13|46->14|47->15|49->17|49->17|49->17|50->18|52->20|52->20|52->20|53->21|55->23|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|63->31|64->32|65->33
                  -- GENERATED --
              */
          