
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

object fieldset extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[views.formdata.StudentFormData],Map[String, Boolean],List[String],Map[String, Boolean],Map[String, Boolean],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(studentForm: Form[views.formdata.StudentFormData],
hobbies: Map[String, Boolean],
levels: List[String],
gpa: Map[String, Boolean],
majors: Map[String, Boolean]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import views.html.bootstrap3._


Seq[Any](format.raw/*5.30*/("""

"""),format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<fieldset>
	<!--Header-->
	<div id="legend">
		<legend>Student Data</legend>
	</div>
	
	<!-- Name-->
	"""),_display_(/*16.3*/text(studentForm("name"),
				label = "Name",
				placeholder = "My Name",
				help = "Please enter your first and last name. (required)")),format.raw/*19.64*/("""
				
	"""),format.raw/*21.2*/("""<!--Password-->
	"""),_display_(/*22.3*/password(studentForm("password"),
				label = "Password",
				placeholder = "",
				help = "Password must be five or more characters. (required)")),format.raw/*25.67*/("""
				
	"""),format.raw/*27.2*/("""<!--Hobbies-->
	"""),_display_(/*28.3*/checkboxes(studentForm("hobbies"),
				label = "Hobbies",
				checkboxMap = hobbies,
				help = "Check zero or more hobbies. (optional)")),format.raw/*31.53*/("""
	
	"""),format.raw/*33.2*/("""<!--Grade Level-->
	"""),_display_(/*34.3*/radiobuttons(studentForm("level"),
					label = "Year",
					buttonNameList = levels,
					help = "Select your year. (required)")),format.raw/*37.44*/("""
	
	"""),format.raw/*39.2*/("""<!--GPA-->
	"""),_display_(/*40.3*/select(studentForm("gpa"),
				label = "GPA",
				optionMap = gpa,
				isMultiple = false,
				help = "Select your GPA. (required)")),format.raw/*44.42*/("""
				
	"""),format.raw/*46.2*/("""<!--Majors-->
	"""),_display_(/*47.3*/select(studentForm("majors"),
				label = "Majors",
				optionMap = majors,
				isMultiple = true,
				help = "Select zero or more majors. (optional)")),format.raw/*51.53*/("""
"""),format.raw/*52.1*/("""<div class = "form-group">
	<div class= "col-sm-offset-2 col-sm-10">
		<button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
		<button id ="cancel" class="btn cancel">Cancel</button>		
	</div>
</div>
</fieldset>"""))
      }
    }
  }

  def render(studentForm:Form[views.formdata.StudentFormData],hobbies:Map[String, Boolean],levels:List[String],gpa:Map[String, Boolean],majors:Map[String, Boolean]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm,hobbies,levels,gpa,majors)

  def f:((Form[views.formdata.StudentFormData],Map[String, Boolean],List[String],Map[String, Boolean],Map[String, Boolean]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm,hobbies,levels,gpa,majors) => apply(studentForm,hobbies,levels,gpa,majors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:42 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/fieldset.scala.html
                  HASH: 07a70041743a054853be616537083e955b7b7368
                  MATRIX: 1057->1|1295->171|1355->166|1385->203|1413->205|1549->315|1711->456|1747->465|1792->484|1962->633|1998->642|2042->660|2203->800|2236->806|2284->828|2437->960|2470->966|2510->980|2667->1116|2703->1125|2746->1142|2922->1297|2951->1299
                  LINES: 28->1|35->7|38->5|40->8|41->9|48->16|51->19|53->21|54->22|57->25|59->27|60->28|63->31|65->33|66->34|69->37|71->39|72->40|76->44|78->46|79->47|83->51|84->52
                  -- GENERATED --
              */
          