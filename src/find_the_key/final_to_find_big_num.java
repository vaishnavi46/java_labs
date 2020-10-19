package find_the_key;

import java.util.Scanner;

public class final_to_find_big_num {
	final static int[] a1= {0,0,0};
	final static int[] a2= {0,0,0};
	final static int[] a3= {0,0,0};
	final static int[] a4= {0,0,0};
	
	static int big_num1(int n,int i)
	{
		int remain;
		remain=n%10;
		a4[i]=remain;
		n=n/10;
		
		remain=n%10;
		a3[i]=remain;
		n=n/10;
		
		remain=n%10;
		a2[i]=remain;
		n=n/10;
		
		remain=n%10;
		a1[i]=remain;
		n=n/10;
		
		
		return 0;
	}
	static int small_num(int[] a)
	{
		int small;
		if(a[0]<a[1] && a[0]<a[2] )
		{
			 small=a[0];
		}
		else if(a[1]<a[2])
		{
			small=a[1];
		}
		else
		{
			small=a[2];
		}
		return small;
	}
	static int big_num(int[] b)
	{
		int big;
		if(b[0]>b[1] && b[0]>b[2] )
		{
			big=b[0];
		}
		else if(b[1]>b[2])
		{
			big=b[1];
		}
		else
		{
			big=b[2];
		}
		return big;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=0;
		int n3=0;
		
		int[] result = {0,0,0,0};
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		big_num1(n1,0);
		big_num1(n2,1);
		big_num1(n3,2);
		
		result[0]=small_num(a1);
		result[1]=big_num(a2);
		result[2]=small_num(a3);
		result[3]=big_num(a4);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}
