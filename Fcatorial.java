import java.io.*;
import java.util.*;
class Fcatorial
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int fact=1;
    for(int i=1; i<=s; i++)
    {
        fact=fact*i;
    }
    System.out.print(fact);
  }
}

