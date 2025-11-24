import java.util.*;
public class NonRepeatingElement {
    public static char nonRepeatingChar(String s) {
        // code here
        int i,j,f=0;
        for(i=0;i<s.length();i++)
        {
            f=0;
            for(j=0;j<s.length();j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(s.charAt(i)==s.charAt(j))
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                char a=s.charAt(i);
                return a;
            }
        }
        return '$';
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        System.out.println("The non repeating character is: "+nonRepeatingChar(s));
        sc.close();
    }
}


