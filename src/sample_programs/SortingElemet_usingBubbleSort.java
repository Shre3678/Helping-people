package sample_programs;

import java.util.Arrays;

public class SortingElemet_usingBubbleSort {

	public static void main(String[] args) 
	{
	int a[]= {10,30,20,40,50};
	int n=a.length;
	
	System.out.println("Before Sort " + Arrays.toString(a));

for(int i=0;i<n-1;i++)// this is for passes
{
	for(int j=0;j<n-1;j++)// this si for interations
	{
		if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	
}
System.out.println("After sort " + Arrays.toString(a));
	
	}

}
