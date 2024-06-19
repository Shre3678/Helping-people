package sample_programs;

public class binarySearch_Element
{
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		boolean flag=false;
		int b_search=4;
		int l=0;
		int h=a.length-1;
		
		
		while(l<=h)
		{
			int mid =(l+h)/2;
			if(a[mid]==b_search)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
			if(a[mid]<b_search)
			{
				l=mid+1;
			}
			if(a[mid]>b_search)
			{
				h=mid-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Not Found");
		}
	    
	}
	
}