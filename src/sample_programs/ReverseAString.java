package sample_programs;

public class ReverseAString {

	public static void main(String[] args) 
	
	{
		String forward="ABCD";
		String forrr="123";
		String Reverse="";
		
	int length=forward.length();
	
	//one approach
		
	for(int i=0;i<length;i++)
		{
		for(int j=0;j<forrr.length();j++)
			Reverse=forward.charAt(i)+Reverse;
		
		}
	System.out.println(Reverse);
		
		//second approach
		
		/*char a[]=forward.toCharArray();
		for(int i=0;i<length;i++)
		{
			Reverse=a[i]+Reverse;
		}*/
		 
		//Third apporach using StringBuffer
		
	//	StringBuffer sb= new StringBuffer(forward);
		//StringBuffer reverse=sb.reverse();
	    //System.out.println(reverse);
	    
	    
	}
	

}
