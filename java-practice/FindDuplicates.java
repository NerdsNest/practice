import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for(int key : countMap.keySet()) {
            if(countMap.get(key) > 1) {
                res.add(key);
            }
        }

        return res;
    }
}

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        ArrayList<Integer> duplicates = solution.findDuplicates(arr);

        System.out.println("Duplicate elements are: " + duplicates);

        sc.close();
    }
}
