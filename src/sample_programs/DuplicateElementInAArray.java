package sample_programs;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementInAArray {

	public static void main(String[] args) 
	{
            String arr[]= {"Java", "c", "Java", "code", "python"};

           //approach 1 
           for(int i=0;i<arr.length;i++)
            {
            	for(int j=i+1;j<arr.length;j++)
            	{
            		if(arr[i]==arr[j])
            		{
            			System.out.println("the duplicate element in array " +arr[i]);
            		}
            		
            	}
            	
            }
           
	   /*  boolean flag=false;   
            HashSet <String>langs=new HashSet();
            
            for(String l:arr)
            {
            //	System.out.println(langs.add(l));// it will give if that found duplicate it will give false
             
            
            if(langs.add(l)==false)
            {
            	System.out.println("Found Duplicate is "  +l);
            	flag=true;
            }
            }
            if(flag==false)
            {
            	System.out.println("Not Found");
            }*/
            
            // how to remove duplicates
            int c[]= {1,2,3,4,5,5};
            
            int[] d=Arrays.stream(c).distinct().toArray();
            
            Object[] a= Arrays.stream(arr).distinct().toArray();
            
          /*  for(Object c:b)
            {
            	System.out.print(c+ " ");
            }*/
            System.out.println(Arrays.toString(d));
            System.out.println(Arrays.toString(a));
	}
	

}
