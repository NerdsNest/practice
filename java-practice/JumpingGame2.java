import java.util.*;
public class JumpingGame2 
{
    public static int jump(int[] nums) {
        int jump=0,cend=0,farthest=0;
        for(int i=0;i<nums.length-1;i++)
        {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==cend)
            {
                jump++;
                cend=farthest;
            }
        }
        return jump;
        
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
        System.out.println(jump(arr));
        sc.close();
    }
}
