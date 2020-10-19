package find_the_key;

public class Array_func {
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
		int[] result = {0,0,0,0};

		int[] a1= {1,2,4};
		int[] a2= {3,4,2};
		int[] a3= {4,1,6};
		int[] a4= {2,2,9};
		
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
