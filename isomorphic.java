import java.util.*;
class isomorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        HashSet<String> hs=new HashSet<String>();
        for(int i=0; i<s1.length(); i++)
        {
            hs.add(Character.toString(s1.charAt(i)));
        }
        HashSet<String> hs1=new HashSet<String>();
        for(int i=0; i<s1.length(); i++)
        {
            hs1.add(Character.toString(s2.charAt(i)));
        }
        if(hs.size()==hs1.size())
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
