package Java_Inheritance;

public class Testcase1_child extends Hyrarichal_level_concept_PreCondition_Parent
{
	static void login()
	{
		System.out.println("Hello");
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
		Testcase1_child X = new Testcase1_child();
		start();
		login();
		user("Shrenivas", " Shetty");
		X.password(3678);
		end();
}
}
