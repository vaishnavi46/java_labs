package find_the_key;

import java.util.Scanner;

public class missing_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N;
	    	Scanner sc=new Scanner(System.in);
	    	N=sc.nextInt();
	    	int[] numbers=new int[N];
	    	for(int i=0;i<N;i++)
	        {
	          numbers[i]=sc.nextInt();
	        }
	        int idealSum = (N * (N + 1)) / 2;
	     
	        int sum = calculateSum(numbers);
	        //System.out.println(sum);
	        int missingNumber = (idealSum-sum);
	        System.out.println(missingNumber);
	    }
	 
	    private static int calculateSum(int[] numbers) 
	    {
	        int sum = 0;
	        for (int n : numbers) 
	        {
	            sum += n;
	        }
	        //System.out.println(sum);
	        return sum;
	    }
	}


