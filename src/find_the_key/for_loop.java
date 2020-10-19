package find_the_key;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int N=4;
		int[] numbers=new int[N];
		for(int i=0;i<N;i++)
        {
          numbers[i]=sc.nextInt();
        }
        for (int n : numbers) 
        {
//            sum += n;
//            System.out.println(sum);
        	System.out.println(n);
        }
	}

}
