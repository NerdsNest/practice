import java.util.*;
public class VowelOrNot {
    public static String isVowel(char c) {
        // code here
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return "YES";
        else
            return "NO";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character: ");
        char c=sc.next().charAt(0);
        System.out.println(isVowel(c));
        sc.close();
    }
}

