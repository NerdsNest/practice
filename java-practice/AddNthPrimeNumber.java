import java.util.*;
public class AddNthPrimeNumber 
{
    public static void main(String args[]) 
    {
        int n,i,j,u,count=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of elements in array: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements of array: ");
        for (i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter nth prime number: ");
        u=sc.nextInt();

        int p=0; 
        for (i=2; ;i++) 
        { 
            boolean isPrime=true;
            for (j=2;j<=i;j++) {
                if (i%j==0) {
                    isPrime=false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count==u) {
                    p=i;
                    break;
                }
            }
        }

        System.out.println("Array after adding " + u + "th prime (" + p + "):");
        for (i= 0;i<n;i++) {
            arr[i]=arr[i]+p;
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
