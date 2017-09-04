package models;

import java.util.ArrayList;
import java.util.List;
import views.formdata.StudentFormData;

public class Student {

	private long id;
	private String name;
	private String password;
	private List<Hobby> hobbies = new ArrayList<>();
	private GradeLevel level;
	private GradePointAverage gpa;
	private List<Major> majors = new ArrayList<>();
	
	/**Model entities want to have no-arg constructors**/
	public Student(){}
	
	public Student(long id, String name, String password, GradeLevel level, GradePointAverage gpa){
		this.setId(id);
		this.name = name;
		this.password = password;
		this.level = level;
		this.gpa = gpa;
	}
	
	private long getId(){
		return id;
	}
	private void setId(long id){
		this.id = id;
	}
	
	public boolean hasHobby(String hobbyName){
		for(Hobby hobby : this.hobbies){
			if(hobbyName.equals(hobby.getName()))
				return true;
		}
		return false;
	}
	
	public void addHobby(Hobby hobby){
		this.hobbies.add(hobby);
	}
	
	public boolean hasMajor(String majorName){
		for(Major major :this.getMajors()){
			if(majorName.equals(major.getName()))
				return true;
		}
		return false;
	}
	
	public String toString(){
		return String.format("[Student Name: '%s' Password: '%s', Hobbies: %s Grade Level: %s GPA: %s Majors: %s]", this.getName(),
				this.getPassword(), this.hobbies, this.level, this.gpa, this.getMajors());
	}
	
	
	/***
	 * return name
	 ***/
	public String getName(){
		return name;
	}
	
	
	/***
	 * set name to param name
	 ***/
	public void setName(String name){
		this.name = name;
	}
	
	/***
	 * return password
	 ***/
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public GradeLevel getLevel(){
		return level;
	}
	
	public void setLevel(GradeLevel level){
		this.level = level;
	}
	
	public GradePointAverage getGpa(){
		return gpa;
	}
	
	public void setGpa(GradePointAverage gpa){
		this.gpa = gpa;
	}
	
	public List<Major> getMajors(){
		return majors;
	}
	
	public void setMajors(List<Major> majors){
		this.majors = majors;
	}
	
	public void addMajor(Major major){
		this.majors.add(major);
	}
	
	public static StudentFormData makeStudentFormData(long id){
		for(Student student : allStudents){
			if(student.getId() == id){
				return new StudentFormData(student.name, student.password, student.level, student.gpa, student.hobbies, student.majors);		
			}
		}
		throw new RuntimeException("Could't find student");
	}
	
	public static Student  makeInstance(StudentFormData formData){
		Student student = new Student();
		student.name = formData.name;
		student.password = formData.password;
		for(String hobby : formData.hobbies){
			student.hobbies.add(Hobby.findHobby(hobby));
		}
		
		student.level = GradeLevel.findLevel(formData.level);
		student.gpa = GradePointAverage.findGPA(formData.gpa);
		for(String major : formData.majors){
			student.majors.add(Major.findMajor(major));
		}
	return student;
	}
	
	//Fake database
	private static List<Student> allStudents = new ArrayList<>();
	static{
		allStudents.add(new Student(1L, "Mingina Mathea", "mypassword", GradeLevel.findLevel("First year"), GradePointAverage.findGPA("2.3")));
		allStudents.add(new Student(4L, "Ben Mwangi", "mypassword", GradeLevel.findLevel("Fourth year"), GradePointAverage.findGPA("3.7")));
		
		getById(4L).addHobby(Hobby.findHobby("Biking"));
		getById(4L).addHobby(Hobby.findHobby("Hiking"));
		getById(4L).addMajor(Major.findMajor("Computer Science"));
		getById(4L).addMajor(Major.findMajor("Electrical Engineering"));
		
		//Invalid student: password too short
		allStudents.add(new Student(3L, "Rose Flower", "pass", GradeLevel.findLevel("Second Year"), GradePointAverage.findGPA("3.5")));
	}
	
	public static Student getById(long id){
		for(Student student : allStudents){
			if(student.getId() == id){
				return student;
			}
		}
		throw new RuntimeException("Couldn't find student");
	}
	
}
	
	

