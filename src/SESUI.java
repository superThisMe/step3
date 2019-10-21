package Step3;

import java.util.Scanner;

/**
 * <pre>
 * SES(Soft Engineer School) ���� ���α׷��� ����� ȭ��(User Interface) Ŭ����
 * ����ڷκ��� ó���� ���õ� �Է��� �ް�, SESManager Ŭ������ ���� ó���� ����� �����ش�.
 * </pre>
 */
public class SESUI {
	private SESManager manager = new SESManager(); //��û�� ���õ� ó���� �ϱ� ���� ������ SESManager Ŭ������ ��ü
	private Scanner sc = new Scanner(System.in); //Ű����κ��� ������ �Է¹ޱ� ���� ������ Scanner Ŭ������ ��ü
	
	/**
	 * <pre>
	 * SES(Soft Engineer School) ���� ���α׷��� ����� ȭ���� �����ϰ� ����� �Է��� ����Ѵ�.
	 * ���α׷��� ���� �޴��� �����ϱ� ������ ���� �ݺ��Ͽ� ó�� �ȴ�.
	 * </pre> 
	 * */
	public SESUI(){
		while(true){
			printMainMenu();
			int no = 0;
			String jumin = null;
			
			try{
				no = (int)Integer.parseInt(sc.next());
			} catch(NumberFormatException numberError){
				System.out.println("�Է� ����! �ٽ� �Է��ϼ���.");
				continue;		
			} 
			
			switch (no)	{
				case 1 : this.insertHuman();
							break;
				case 2 : System.out.print("���ֹι�ȣ �Է¦� ");
							jumin = sc.next();
							Human result = manager.findHuman(jumin);
							if (result == null){
								System.out.println("��!!�˻���� : �����Ϳ� ���� �ֹι�ȣ!!��" );
							}else{
								result.showInfo();
							}
					break;
				case 3 : System.out.print("���ֹι�ȣ �Է¦� ");
							jumin = sc.next(); 
							boolean answer = manager.deleteHuman(jumin);
							if (answer == true){
								System.out.println("������ �Ϸᦢ");
							}else if (answer == false){
								System.out.println("��!!��������!!��");
							}							
					break;
				case 4 : manager.showAll();
								break;
				case 9 : return;
				default : System.out.printf("�޴��Է¿���!%n%n");
				
			}
		}//while
	}
	
	/**
	 * <pre>
	 * SES(Soft Engineer School) ���� ���α׷��� ��� �޴��� ���� ó���� ����Ѵ�.
	 * �����ο�(����, ������, ���)�� ���� ����� ���� �޴��� �����ְ�, �Է¹��� Professor, Trainee, Staff ��ü�� SESManager�� ���� ����Ѵ�.
	 * </pre>
	 * */
	public void insertHuman(){
		while(true){
			printInsertMenu();
			int no = 0;
			Human h = null;
			try{
				no = (int)Integer.parseInt(sc.next());
			} catch(NumberFormatException numberError){
				System.out.println("�Է� ����! �ٽ� �Է��ϼ���.");
				continue;		
			} 
			switch (no){
			case 1: h = makeHuman(no); 
					break;
			case 2: h = makeHuman(no);
					break;
			case 3: h = makeHuman(no);
					break;
			case 4 : return;
			default : System.out.println("�޴���ȣ �Է¿���!!");
					insertHuman();					
			}
			// �޴���ȣ �Է¿��� �� ������Ʈ ������ ���ϱ� ���� �ڵ�
			if (h == null){
				break;
			}
			boolean answer = manager.insertHuman(h);
			if (answer == true){
				System.out.println("�����ϵǾ����ϴ�.");
			}else if (answer == false){
				System.out.println("������ �ֹι�ȣ�� �����մϴ�.");
			}
			
		}//while
	}
	
	// ��ü ���� �żҵ�
	public Human makeHuman(int type){
		Human result = null;			
		
		exit :
		while(true){
				int a = 0;
				System.out.print("���̸��� ");
				String n = sc.next();
				try{
					System.out.print("�����̦� ");
					a = (int)Integer.parseInt(sc.next());
				}catch(NumberFormatException numberError){
					System.out.println("�Է� ����! �ٽ� �Է��ϼ���.");
					break ;		
				} //try catch
				
				System.out.print("���ֹι�ȣ�� ");
				String j = sc.next();
				switch (type){
				case 1: System.out.print("�������� ");
						String m = sc.next();
						result = new Professor(n,a,j,m);
						break exit;
				case 2:	System.out.print("���й��� ");
						String s = sc.next();	
						result =  new Trainee(n,a,j,s);
						break exit;
				case 3:	System.out.print("���μ��� ");
						String f = sc.next();	
						result = new Staff(n,a,j,f);
						break exit;		
				} //switch		
		
			}//while		
		
		
		return result;
	}
	

	/**
	 * SES(Soft Engineer School) ���� ���α׷��� ���� �޴��� ����Ѵ�.
	 * */
	public void printMainMenu(){
		System.out.println("��������������������������������������");
		System.out.println("�� Soft Engineer School ���� �ý��� ��");
		System.out.println("��������������������������������������");
		System.out.println("��������������������������������������");
		System.out.println("��1.���                            ��");	
		System.out.println("��2.ã��                            ��");	
		System.out.println("��3.����                            ��");	
		System.out.println("��4.��ü���                        ��");	
		System.out.println("��9.����                            ��");
		System.out.println("��������������������������������������");
		System.out.print(" �޴� ��ȣ�� �����ϼ���=> ");	
	}
	
	/**
	 * SES(Soft Engineer School) ���� ���α׷��� �����ο� ��� ���� �޴��� ����Ѵ�.
	 * */
	public void printInsertMenu(){
		System.out.println("��������������������������������������");
		System.out.println("��        SES �����ο� ���         ��");
		System.out.println("��������������������������������������");
		System.out.println("��������������������������������������");
		System.out.println("��1.����                            ��");	
		System.out.println("��2.������                          ��");	
		System.out.println("��3.���                          ��");	
		System.out.println("��4.�����޴�                        ��");
		System.out.println("��������������������������������������");
		System.out.print(" �޴� ��ȣ�� �����ϼ���=> ");	
	}

	
	
}

	