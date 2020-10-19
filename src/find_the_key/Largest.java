package find_the_key;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,4};
		int[] b= {3,4,2};
		int[] c= {4,1,6};
		int[] d= {2,2,9};
		
		if(a[0]<a[1] && a[0]<a[2] )
		{
			System.out.print(a[0]);
		}
		else if(a[1]<a[2])
		{
			System.out.print(a[1]);
		}
		else
		{
			System.out.print(a[2]);
		}
		
		
		if(b[0]>b[1] && b[0]>b[2] )
		{
			System.out.print(b[0]);
		}
		else if(b[1]>b[2])
		{
			System.out.print(b[1]);
		}
		else
		{
			System.out.print(b[2]);
		}
		
		if(c[0]<c[1] && c[0]<c[2] )
		{
			System.out.print(c[0]);
		}
		else if(c[1]<c[2])
		{
			System.out.print(c[1]);
		}
		else
		{
			System.out.print(c[2]);
		}
		
		if(d[0]>d[1] && d[0]>d[2] )
		{
			System.out.print(d[0]);
		}
		else if(d[1]>d[2])
		{
			System.out.print(d[1]);
		}
		else
		{
			System.out.print(d[2]);
		}
		
		
		
	}

}
