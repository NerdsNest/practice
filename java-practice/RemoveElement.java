import java.util.*;

public class RemoveElement 
{
    public static int removeElement(int[] nums, int val) {
        int j = 0,i; 

        for (i=0; i<nums.length;i++) 
        {
            if (nums[i]!=val) 
            {
                nums[j]=nums[i];
                j++;
            }
        }

        return j;
    }
    public static void main(String args[])
    {
        int n,i,val;
        System.out.println("Enter no of elements in an array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter number to be removed: ");
        val=sc.nextInt();
        removeElement(nums,val);
        sc.close();
    }
}
    
