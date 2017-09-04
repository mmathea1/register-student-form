package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import views.formdata.StudentFormData;

public class GradePointAverage {

	private long id;
	private String name;
	
	public GradePointAverage(long id, String name){
		this.id= id;
		this.name = name;
	}
	public void setId(long id){
		this.id =id;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public static Map<String, Boolean> makeGPAMap(StudentFormData student){
		Map<String, Boolean> gpaMap = new TreeMap<String, Boolean>();
		for(GradePointAverage gpa : allGPAs){
			gpaMap.put(gpa.getName(), (student == null) ? false : (student.gpa !=null && student.gpa.equals(gpa.getName())));	
		}
		return gpaMap;
	}
	public static List<String> getGPAList(){
		String[] nameArray = {"4.0", "3.0 - 3.9", "2.0 - 2.9", "1.0 - 1.9"};
		return Arrays.asList(nameArray);
	}
	
	public static GradePointAverage findGPA(String gpaName){
		for(GradePointAverage gpa : allGPAs){
			if(gpaName.equals(gpa.equals(gpa.getName()))){
				return gpa;
			}
		}
		return null;
	}
	
	public static GradePointAverage getDefaultGPA(){
		return findGPA("4.0");
	}
	
	@Override
	public String toString(){
		return String.format("[GPA %s]", this.name);
	}
	
	private static List<GradePointAverage> allGPAs = new ArrayList<>();
	
	static{
		  allGPAs.add(new GradePointAverage(1L, "4.0"));
		  allGPAs.add(new GradePointAverage(2L, "3.0 - 3.9"));
		  allGPAs.add(new GradePointAverage(3L, "2.0 - 2.9"));
		  allGPAs.add(new GradePointAverage(4L, "1.0 - 1.9"));
	}
}
