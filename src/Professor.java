package Step3;

import java.io.Serializable;

public class Professor extends Human implements Serializable{
	private String major;
	public Professor(String name, int age, String jumin, String major){
		 //�θ�Ŭ������ü�� ���� �����Ǿ� ��ӹ��� ���� �ʱ�ȭ�� ����    (���� ���� �ʿ�)
		 // ��ü �����ÿ� ���� �����ڿ� ���� ���� - ������(�Ű�����)
		super(name, age, jumin); //�Ű����� ����, ������, �ֹ��� �θ�Ŭ������ �����ڿ��� �Ѱ��ش�
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
	public void setMajor(String m){
		this.major = m;
	}
	//�������̵� �ۼ�
	public void showInfo(){
		// �θ�Ŭ������ ������ �޼ҵ带 �״�� ���
		super.showInfo();
		System.out.printf(", ����: %s%n", major);
	// System.out.printf("�̸�: %s, ����: %d, �ֹι�ȣ: %s, ����:%s%n",getName(), getAge(), get.Jumin(), major); 
							// <- getter�տ� super�� �Ⱥٿ��� �� Ŭ������ ���� �޼ҵ���̱⿡ �ڵ����� �θ�Ŭ���� �żҵ���� �˻�
	}
}
