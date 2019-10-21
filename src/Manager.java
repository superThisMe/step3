package Step3;
import java.util.ArrayList;

//매니져 인터페이스를 SES 매니저로 구현하고자 할때 
interface Manager{
	
	
	public boolean insertHuman(Human human);
	public Human findHuman(String jumin);
	public boolean deleteHuman(String jumin);
	public void showAll();	
}