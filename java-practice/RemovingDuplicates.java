import java.util.*;
public class RemovingDuplicates {
    // Function to remove duplicates from the given array.
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.contains(num)) {
                res.add(num);
                seen.add(num);
            }
        }
        
        return res;
    }
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter number of elements: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(removeDuplicates(arr));
        sc.close();
    }
}

