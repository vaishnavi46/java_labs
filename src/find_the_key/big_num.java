package find_the_key;

public class big_num {
	final static int[] a1= {0,0,0};
	final static int[] a2= {0,0,0};
	final static int[] a3= {0,0,0};
	final static int[] a4= {0,0,0};
	
	static int big_num(int n,int i)
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1342;
		int n2=2412;
		int n3=4269;
		
		big_num(n1,0);
		big_num(n2,1);
		big_num(n3,2);
		
		
		
	}

}
