import java.util.*;
public class CombineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		String s="";
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=n-1; i>=0; i--)
		{
			s=s+a[i];
		}
		int c=(Integer.valueOf(s));
		if(c>0)
		System.out.println(s);
		else
			System.out.println(0);

	}
}
