package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import views.formdata.StudentFormData;

public class Hobby {
	private long id;
	private String name;
	
	public Hobby(long id, String name){
		this.id = id;
		this.name = name;
	}

	public void setId(long id){
		this.id =id;
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
	
	public static Map<String, Boolean> makeHobbyMap(StudentFormData student){
		Map<String, Boolean> hobbyMap = new HashMap<String, Boolean>();
		for(Hobby hobby : allHobbies){
			hobbyMap.put(hobby.getName(), (student != null && student.hobbies.contains(hobby.getName())));
		}
		return hobbyMap;
	
	}
	
	public static Hobby findHobby(String hobbyName){
		for(Hobby hobby : allHobbies){
			if(hobbyName.equals(hobby.getName())){
				return hobby;
		}
		}
		return null;
	}
	
	@Override
	public String toString(){
		return String.format("[Hobby %s]", this.name);
	}
	
	/**Fake database**/
	private static List<Hobby> allHobbies = new ArrayList<>();
	
	/**Instantiate fake db**/
	static{
		allHobbies.add(new Hobby(1L, "Surfing"));
		allHobbies.add(new Hobby(2L, "Biking"));
		allHobbies.add(new Hobby(3L, "Hiking"));
		allHobbies.add(new Hobby(4L, "Running"));
	}
	
}
