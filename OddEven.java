import java.io.*;
import java.util.*;
class OddEven
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    if(s%2==0)
    {
    System.out.print("Even");
    }
    else if(s%2!=0)
    {
      System.out.print("Odd");
    }
    else
    {
      System.out.print("invalid");
    }
  }
}
