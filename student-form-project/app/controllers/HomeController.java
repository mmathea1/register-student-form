package controllers;

import models.GradeLevel;
import models.GradePointAverage;
import models.Hobby;
import models.Major;
import models.Student;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.formdata.StudentFormData;
import javax.inject.Inject;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private final Form<StudentFormData> formData;

    @Inject
	public HomeController(FormFactory formFactory){
    	  this.formData = formFactory.form(StudentFormData.class);
	}
    public Result getIndex(long id) {
        StudentFormData studentData = (id == 0) ? new StudentFormData() : models.Student.makeStudentFormData(id);
	/**this.formData = formFactory.fill(studentData);**/
        return ok(views.html.index.render(
        		formData,
        		Hobby.makeHobbyMap(studentData),
        		GradeLevel.getNameList(),
        		GradePointAverage.makeGPAMap(studentData),
        		Major.makeMajorMap(studentData)));
    }
    public Result postIndex(){
    	/**Form<StudentFormData> formData = Form.form(StudentFormData.class).bindFromRequest();**/
    	
    	if(formData.hasErrors()){
    		//don't call formData.get(), pass null to helpers instead
    		flash("error", "Please correct errors above.");
    		return badRequest(views.html.index.render(formData,
    				Hobby.makeHobbyMap(null),
    				GradeLevel.getNameList(),
    				GradePointAverage.makeGPAMap(null),
    				Major.makeMajorMap(null)));	
    	}
    	
    	else{
    		Student student = Student.makeInstance(formData.get());
    		flash("success", "Student instance created/edited: " + student);
    		return ok(views.html.index.render(formData,
    				Hobby.makeHobbyMap(formData.get()),
    				GradeLevel.getNameList(),
    				GradePointAverage.makeGPAMap(formData.get()),
    				Major.makeMajorMap(formData.get())));
    	}
    }

}
