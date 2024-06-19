package sample_programs;

public class MinMaxValueInArray 
{

	public static void main(String[] args) 
	{
               int a[]= {10,30,40,50,60}; //max 60 min 10
               
               int max=a[0];
               int min=a[0];
               
               for(int i=1;i<a.length;i++)
               {
            	   if(a[i]>max)
            	   max=a[i];
               }
               for(int i=1;i<a.length;i++)
               {
            	   if(a[i]<min)
            		   min=a[i];
               }
            	   
    System.out.println("The max and min values in array "+ max +" "+ min);  
    System.out.println();
	}

}
