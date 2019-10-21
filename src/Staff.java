package Step3;

import java.io.Serializable;

public class Staff extends Human implements Serializable{
	private String field;
	public Staff(String name, int age, String jumin, String field){
		super(name, age, jumin);
		this.field  = field;
	}
	public String getField(){
		return field;
	}
	public void setField(String field){
		this.field = field;
	}
	public void showInfo(){
		super.showInfo();
		System.out.printf(", ºÎ¼­: %s%n", field);
	}
}