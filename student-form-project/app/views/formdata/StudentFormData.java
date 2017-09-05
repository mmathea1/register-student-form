/**
 * 
 */
package views.formdata;

import java.util.ArrayList;
import java.util.List;

import models.Major;
import models.Hobby;
import models.GradeLevel;
import models.GradePointAverage;

import play.data.validation.ValidationError;


public class StudentFormData {
	public String name = "";
	public String password = "";
	public List<String> hobbies = new ArrayList<>();
	public String level = "";
	public String gpa = "";
	public List<String> majors = new ArrayList<>();
	
	/**
	 * required for form instantiaon**/
	public StudentFormData(){}
	/**
	 * Create an initialized form instance**/
	//errors coz you need to import models
	public StudentFormData(String name, String password, GradeLevel level, GradePointAverage gpa, List<Hobby> hobbies, List<Major> majors){
		this.name = name;
		this.password = password;
		this.level = level.getName();
		this.gpa = gpa.getName();
		for(Hobby hobby : hobbies){
			this.hobbies.add(hobby.getName());
		}
		for(Major major : majors){
			this.majors.add(major.getName());
		}
	}
	
	public List<ValidationError> validate(){
		List<ValidationError> errors = new ArrayList<>();
		if(name == null || name.length() == 0){
			errors.add(new ValidationError("name", "No name was given"));
		}
		if(password == null || password.length()== 0){
			errors.add(new ValidationError("password", "No password was entered"));
		}else if(password.length() < 5){
			errors.add(new ValidationError("password", "Password should be more than five characters"));
		}
		
		if(hobbies.size() > 0){
			for(String hobby: hobbies){
				if(Hobby.findHobby(hobby)== null){
					errors.add(new ValidationError("hobbies", "Unknown Hobby: " + hobby + "."));
				}
			}
		}
		
		if(level == null || level.length() == 0){
			errors.add(new ValidationError("level", "No level was given"));
		}else if(GradeLevel.findLevel(level)== null){
			errors.add(new ValidationError("level", "Unknown Level: " + level + "."));
		}
		
		if(gpa == null || gpa.length() == 0){
			errors.add(new ValidationError("gpa", "No GPA was given"));
		}else if(GradePointAverage.findGPA(gpa) == null){
			errors.add(new ValidationError("gpa", "Unknown GPA: " + gpa + "."));
		}
		
		if(majors.size() > 0){
			for(String major: majors){
				if(Major.findMajor(major)==null){
					errors.add(new ValidationError("majors", "Unknown Major: " + major + "."));
				}
			}
		}
		
		if(errors.size() > 0){
			return errors;
		}
		
		return null;
		}

}
