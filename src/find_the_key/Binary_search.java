package find_the_key;

import java.util.Scanner;

public class Binary_search {
	
	static int binary_search(int[] array,int low,int high,int element)
	{
		int res=0;
		int mid=(low+high)/2;
		if(low<=high)
		{
			
			if(array[mid]==element)
			{
				res=mid;
			}
			if(array[mid]>element)
			{
				res=binary_search(array,low,mid-1,element);
			}
			if(array[mid]<element)
			{
				res=binary_search(array,mid+1,high,element);
			}
			
		}
		else
		{
			System.out.println("not found");
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int search;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] elements=new int[n];
		for(int i=0;i<n;i++)
		{
			elements[i]=sc.nextInt();
			
		}
		search=sc.nextInt();
		int result=binary_search(elements,1,n-1,search);
		if(result!=0)
		{
		System.out.println(result);
		}
		
		
	}

}
