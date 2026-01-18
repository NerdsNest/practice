import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for fibonacci");
        int val=sc.nextInt();
        int i=0,a=0,b=1,c;
        while(i<val)
        {
            System.out.print(a+" ");
            c=a+b;;
            a=b;
            b=c;
            i++;
        }
        sc.close();
    }
}
