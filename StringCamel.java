import java.io.*;
import java.util.*;
class StringCamel
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1[]=s.split(" ");
    for(int i=0; i<s1.length; i++)
    {
        for(int j=0; j<s1[i].length(); j++)
        {
            if(j==0 && (((int)(s1[i].charAt(j)))>=97))
            {
                System.out.print((char)((int)(s1[i].charAt(j))-32));
            }
            else
            {
                System.out.print(s1[i].charAt(j));
            }
        }
        if(i<s1.length-1)
        {
            System.out.print(" ");
        }
    }  
  }
}

