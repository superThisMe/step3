package Step3;
import java.util.ArrayList;
public class SESTest {
	public static void main(String[] args){
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(new Professor("�ֽ�ȣ", 30, "11-11","�ڹ�"));
		list.add(new Trainee("ȫ�浿", 20, "11-22","01"));
		list.add(new Staff("������", 25, "11-33","�л����"));
		for (Human human : list){
			System.out.println("�̸�: "+ human.getName());
			System.out.println("����: "+ human.getAge());
			System.out.println("�ֹι�ȣ: "+ human.getJumin());
			if (human instanceof Professor){
				System.out.println("����: "+ ((Professor)human).getMajor());
			}else if (human instanceof Trainee){
				System.out.println("�й�: "+ ((Trainee)human).getStdNo());
			}else if (human instanceof Staff){
				System.out.println("�μ�: "+ ((Staff)human).getField());
			}
			
			
			
		
		}
	}
}
