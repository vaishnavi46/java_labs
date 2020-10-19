package find_the_key;

import java.util.Scanner;

public class House_robber {
	public static void main(String[] args) {
		int n=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i+=2)
		{
			result=result+a[i];
		}
		System.out.println(result);

	}
}