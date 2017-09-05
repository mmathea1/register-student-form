
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

object password extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label:String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <input
        type="password"
        class="form-control"
        id=""""),_display_(/*9.14*/field/*9.19*/.id),format.raw/*9.22*/(""""
        name=""""),_display_(/*10.16*/field/*10.21*/.name),format.raw/*10.26*/(""""
        value=""""),_display_(/*11.17*/field/*11.22*/.value.getOrElse("")),format.raw/*11.42*/(""""
        placeholder=""""),_display_(/*12.23*/placeholder),format.raw/*12.34*/("""" />
      <span class="help-block">"""),_display_(/*13.33*/help),format.raw/*13.37*/("""</span>
      <span class="help-block">"""),_display_(/*14.33*/{field.error.map { error => error.message }}),format.raw/*14.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:43 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/bootstrap3/password.scala.html
                  HASH: 248f15cd84b7a5ef24d850b7f89bcb8b8e2d083d
                  MATRIX: 982->1|1163->87|1195->93|1245->117|1272->136|1311->138|1351->148|1424->195|1449->200|1596->321|1609->326|1632->329|1677->347|1691->352|1717->357|1763->376|1777->381|1818->401|1870->426|1902->437|1967->475|1992->479|2060->520|2125->564
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14
                  -- GENERATED --
              */
          