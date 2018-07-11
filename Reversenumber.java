import java.io.*;
import java.util.*;
class Reversenumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int s1=sc.nextInt();
    String s=String.valueOf(s1); 
    StringBuffer sb=new StringBuffer(s);
    System.out.print(sb.reverse());
    
  }
}
