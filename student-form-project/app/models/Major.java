package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import views.formdata.StudentFormData;

public class Major {

	private long id;
	private String name;
	
	public Major(long id, String name){
		this.id = id;
		this.name = name;	
	}
	public void setId(long id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public static Map<String, Boolean> makeMajorMap(StudentFormData student){
		Map<String, Boolean> majorMap = new HashMap<String, Boolean>();
		for(Major major : allMajors){
			majorMap.put(major.getName(), (student == null) ? false : student.majors.contains(major.getName()));
		}
		return majorMap;
	}
	
	public static Major findMajor(String majorName){
		for (Major major: allMajors){
			if(majorName.equals(major.getName())){
				return major;
			}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return String.format("[Major %s]", this.name);
	}
	
	/**Fake Database**/
	private static List<Major> allMajors = new ArrayList<>();
	
	/**instantiate the fake database**/
	static{
		allMajors.add(new Major(1L, "Computer Science"));
		allMajors.add(new Major(2L, "BBIT"));
		allMajors.add(new Major(3L, "Electrical Engineering"));
		allMajors.add(new Major(4L, "Nursing"));
	}
}
