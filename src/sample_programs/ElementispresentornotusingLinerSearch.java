package sample_programs;

public class ElementispresentornotusingLinerSearch 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		
		int search_element=90;
		
		boolean flag=false;
		for(int i=1;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found in the posistion of " +i);
				flag=true;
			}
			
		}
         if(flag==false)
         {
        	 System.out.println("Element is not found");
         }
	}

}
