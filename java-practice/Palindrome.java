import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        str=sc.nextLine();
        int j=str.length()-1;
        int f=0;
        for(int i=0;i<str.length();i++,j--)
        {
            if(i==j)
            {
                break;
            }
            else
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==0)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
    
}
