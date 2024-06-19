package Java;

public class Count_theWrods_in_a_Sentance {

	public static void main(String[] args) {
    
		String a= "Hello Good Morning";
		int countthesentance=a.split("\\s").length;
		System.out.println(countthesentance);
		
	}

}
