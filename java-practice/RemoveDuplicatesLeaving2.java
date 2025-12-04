import java.io.*;
import java.util.*;
public class RemoveDuplicatesLeaving2 {
    public static int removeDuplicates(int[] nums) {
    int i = 0; 
    for (int x : nums) 
    {
        if (i < 2 || x != nums[i - 2]) {
            nums[i] = x;
            i++;
        }
    }
    return i;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of array: ");
        n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(nums));
        sc.close();
    }
}

