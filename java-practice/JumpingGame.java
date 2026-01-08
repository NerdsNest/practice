import java.util.Scanner;

public class JumpingGame {
    public static boolean canJump(int[] nums) {
        int maxreach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxreach)
                return false;
            maxreach=Math.max(maxreach,i+nums[i]);
            if(maxreach>=nums.length)
                return true;
        }
        return true;
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
        System.out.println(canJump(arr));
        sc.close();
    }

    
}
