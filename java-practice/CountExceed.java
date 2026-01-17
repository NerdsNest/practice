import java.util.Scanner;

public class CountExceed {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count: ");
        int count=sc.nextInt();
        if(count>100)
            System.out.println("Too many");
        else   
            System.out.println("Ok");
        sc.close();
    }
    
}
