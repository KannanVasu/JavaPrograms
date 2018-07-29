package ww;
import java.util.*;
public class IndexEqualNumber{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0; i<n; i++)
	{
		a[i]=sc.nextInt();
	}
	int c=0;
	for(int i=0; i<n; i++)
	{
		if(i==a[i])
		{
			c=1;
			System.out.print(a[i]+" ");
		}
	}
	if(c==0)
	{
		System.out.println(-1);
	}
}

}
