package Step3;

import java.io.Serializable;

public class Human implements Serializable{
	private String name;
	private int age;
	private String jumin;

	public Human(String name, int age, String jumin){
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	

	public Human(){}


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getJumin(){
		return jumin;
	}
	public void setJumin(String jumin){
		this.jumin = jumin;
	}
	public void showInfo(){
		System.out.printf("�̸�: %s, ����: %d, �ֹι�ȣ: %s",name, age, jumin);
	}
}
