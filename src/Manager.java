package Step3;
import java.util.ArrayList;

//�Ŵ��� �������̽��� SES �Ŵ����� �����ϰ��� �Ҷ� 
interface Manager{
	
	
	public boolean insertHuman(Human human);
	public Human findHuman(String jumin);
	public boolean deleteHuman(String jumin);
	public void showAll();	
}