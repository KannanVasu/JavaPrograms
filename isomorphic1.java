import java.util.*;
class isomorphic1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        
        HashSet<String> hs=new HashSet<String>();
        for(int i=0; i<s1.length(); i++)
        {
            if(Character.isLetter(s1.charAt(i)))
            {
            hs.add(Character.toString(s1.charAt(i)));
            }
        }
      
        if((hs.size())==2)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
            
       
    }
}
