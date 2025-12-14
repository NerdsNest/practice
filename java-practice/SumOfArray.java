import java.util.*;
public class SumOfArray
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr =new ArrayList<>();
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
            sum=sum+(arr.get(i));
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}