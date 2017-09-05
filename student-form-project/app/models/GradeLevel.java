package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeLevel {

	private long id;
	private String name;
	
	public GradeLevel(long id, String name){
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
	
	public static List<String> getNameList(){
		String[] nameArray = {"First year", "Second year", "Third year", "Fourth year", "Other"};
		return Arrays.asList(nameArray);
	}
	
	public static GradeLevel findLevel(String levelName){
		for(GradeLevel level : allLevels){
			if(levelName.equals(level.getName())){
				return level;
			}
		}
		return null;
	}
	
	public static GradeLevel getDefaultLevel(){
		return findLevel("First year");
	}
	
	@Override
	public String toString(){
		return String.format("[GradeLevel %s]", this.name);
	}
	
	private static List<GradeLevel> allLevels = new ArrayList<>();
	
	static{
	    allLevels.add(new GradeLevel(1L, "First year"));
	    allLevels.add(new GradeLevel(2L, "Second year"));
	    allLevels.add(new GradeLevel(3L, "Third year"));
	    allLevels.add(new GradeLevel(4L, "Fourth year"));
	    allLevels.add(new GradeLevel(5L, "Other"));
	}
}
