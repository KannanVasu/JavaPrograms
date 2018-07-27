import java.util.*;
class LongestPrefix
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.nextLine());
		String[] s1=new String[n];
		int min=0;
		for(int i=0; i<n; i++)
		{
			s1[i]=sc.nextLine();
		}
		min=s1[0].length();
		for(int i=0; i<n-1; i++)
		{
			if(min<=s1[i+1].length())
			{}
			else
				min=s1[i+1].length();
		}
		String t="",t2="";
		for(int i=0; i<n; i++)
		{
			if(s1[i].length()==min)
			{
				t=s1[i];
			}
		}
		int c=0;
		for(int i=0; i<min; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(s1[j].charAt(i)==t.charAt(i))
				{
					c=c+1;
				}
			}
			if(c==n)
			{
				t2=t2+(Character.toString(t.charAt(i)));
			}
			else
			{
				break;
			}
			c=0;
		}
		System.out.println(t2);
	}
}
