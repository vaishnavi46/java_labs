package find_the_key;

import java.util.Scanner;

public class sum_up {
 static int SumNumbersDivisible(int m, int n)
 {
	 int sum=0;
	 for(int i=m;i<n;i++)
	 {
		 if(i%3==0 && i%5==0)
		 {
			 sum=sum+i;
		 }
	 }
	 return sum;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		int result=SumNumbersDivisible(a,b);
		System.out.println(result);
	}

}
