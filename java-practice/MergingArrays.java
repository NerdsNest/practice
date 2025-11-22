import java.util.Scanner;

public class MergingArrays {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;   // Pointer for nums1
        int j = n - 1;   // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array

        // Merge from the end
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements, copy them
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergingArrays solution = new MergingArrays();

        // Read size of nums1 and nums2
        System.out.print("Enter number of valid elements in nums1: ");
        int m = sc.nextInt();
        System.out.print("Enter number of elements in nums2: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Read elements of nums1
        System.out.println("Enter " + m + " elements of nums1:");
        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Read elements of nums2
        System.out.println("Enter " + n + " elements of nums2:");
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Merge arrays
        solution.merge(nums1, m, nums2, n);

        // Print merged array
        System.out.println("Merged array:");
        for(int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
