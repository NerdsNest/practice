import java.util.*;

class Solution {
    static long missingNum(int arr[]) {
        int i;
        long actualsum = 0, sum = 0, missing;
        Arrays.sort(arr);
        int n = arr.length - 1;

        actualsum = ((long) arr[n] * (arr[n] + 1)) / 2;  // cast to long

        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        missing = actualsum - sum;

        if (missing == 0) {
            return arr[n] + 1;
        } else {
            return missing;
        }
    }

    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long m = missingNum(arr);
        System.out.println(m);
        sc.close();
    }
}
