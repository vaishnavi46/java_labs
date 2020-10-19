package find_the_key;

import java.util.Scanner;

public class array_multiply {
	static int array_product(int[] array,int n1)
	{
		int i=0;
		int[] element=new int[n1];
		int[] left=new int[n1];
		int[] right=new int[n1];
		int[] prod=new int[n1];
		left[0]=1;
		right[n1-1]=1;
		for(i=1;i<n1;i++)
		{
			left[i]=element[i-1]*left[i-1];
			//System.out.println(left[i]);
		}
		for(int j=n1-2;j>=0;j--)
		{
			right[j]=element[j+1]*right[j+1];
			//System.out.println(right[j]);
		}
		for(i=0;i<n1;i++)
		{
			prod[i]=left[i]*right[i];
			//System.out.println(prod[i]);
		}
		return prod[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int i=0;
		int[] element=new int[n];
	
		for(i=0;i<n;i++)
		{
			element[i]=sc.nextInt();
		}
		int result=array_product(element,n);
		System.out.println(result);
		}
		
	
	

}
