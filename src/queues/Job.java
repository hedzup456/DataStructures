package queues;

public class Job {
	String name, desc;
	public Job (String name, String desc){
		this.name = name;
		this.desc = desc;
	}
	public Job (String name){
		this(name, null);
	}
	
	public void setName(String n){
		this.name = n;
	}
	public void setDesc(String d){
		this.desc = d;
	}
	public String getName(){
		return name;
	}
	public String getDesc(){
		return desc;
	}
}
