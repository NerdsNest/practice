import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[n+1];
        res[0]=1;
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(plusOne(arr));
        sc.close();
    }
    
}
