package Step3;

import java.io.Serializable;

public class  Trainee extends Human implements Serializable{
	private String stdNo;
	public Trainee(String name, int age, String jumin, String stdNo){
		super(name, age, jumin);
		this.stdNo = stdNo;
	}
	public String getStdNo(){
		return stdNo;
	}
	public void setStdNo(String stdNo){
		this.stdNo = stdNo;
	}
	public void showInfo(){
		super.showInfo();
		System.out.printf(", ÇÐ¹ø: %s%n", stdNo);
	}
}
