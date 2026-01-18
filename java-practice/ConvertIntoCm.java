import java.util.*;
public class ConvertIntoCm {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inch: ");
        int inch=sc.nextInt();
        System.out.println("The converted answer is:"+ inch*2.54);
        sc.close();

    }
    
}
