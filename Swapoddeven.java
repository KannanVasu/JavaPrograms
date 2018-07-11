import java.io.*;
import java.util.*;
class Swapoddeven
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int j=1;
    String t="";
    for(int i=0;  j<=(s.length()/2); i=i+2)
    {
         t=s.charAt(i+1)+""+s.charAt(i);
         System.out.print(t);
        j=j+1;
        
    }
    
    
    
  }
}
