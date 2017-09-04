
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

object textarea extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.109*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <textarea class="form-control"
                rows=""""),_display_(/*7.24*/rows),format.raw/*7.28*/("""" 
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/("""" 
                name=""""),_display_(/*9.24*/field/*9.29*/.name),format.raw/*9.34*/("""" 
                placeholder=""""),_display_(/*10.31*/placeholder),format.raw/*10.42*/("""" 
                >"""),_display_(/*11.19*/field/*11.24*/.value.getOrElse("")),format.raw/*11.44*/("""</textarea>
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/("""</span>
      <span class="help-block">"""),_display_(/*13.33*/{field.error.map { error => error.message }}),format.raw/*13.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help) => apply(field,rows,label,placeholder,help)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 04 18:23:44 EAT 2017
                  SOURCE: C:/Users/Mingina/Workspace/register-student-form/student-form-project/app/views/bootstrap3/textarea.scala.html
                  HASH: 6e2646876bce0d4c11e8e6709e57cb593c8ba77a
                  MATRIX: 989->1|1192->108|1224->114|1274->138|1301->157|1340->159|1380->169|1453->216|1478->221|1604->321|1628->325|1679->350|1692->355|1715->358|1768->385|1781->390|1806->395|1867->429|1899->440|1948->462|1962->467|2003->487|2075->532|2100->536|2168->577|2233->621
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|43->11|43->11|43->11|44->12|44->12|45->13|45->13
                  -- GENERATED --
              */
          