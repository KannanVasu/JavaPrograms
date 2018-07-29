package ww;
import java.util.*;
import java.util.Scanner;

public class OnlyOnceNumber {

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
	String s="",t="";
	for(int i=0; i<n; i++)
	{ t=String.valueOf(a[i]+" ");
		if(!s.contains(t))
		{
			s=s+t;
		}
	}
	String t2[]=s.split(" ");
	for(int i=0; i<t2.length; i++)
	{
		int a2=Integer.valueOf(t2[i]);
		for(int j=0; j<n; j++)
		{
			if(a2==a[j])
				c=c+1;
		}
		if(c==1)
			System.out.print(a2+" ");
		c=0;
	}
}

}
