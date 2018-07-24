import java.util.*;
public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		String s="";
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
			String g="("+String.valueOf(a[i])+")";
			if(!s.contains(g))
			{
				s=s+g;
			}
			else 
				System.out.print(a[i]+" ");
		}	
	}
}
