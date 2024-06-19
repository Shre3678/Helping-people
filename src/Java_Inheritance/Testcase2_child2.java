package Java_Inheritance;

public class Testcase2_child2 extends Hyrarichal_level_concept_PreCondition_Parent {

	static void login()
	{
		System.out.println("Hai");
	}
	static void user(String First, String Last)
	{
		System.out.println(First + Last);
	}
	void password(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Testcase2_child2 Z= new Testcase2_child2 ();
		start();
		login();
		user("Shre", " nivas");
		Z.password(99121);
		end();

	}

}
