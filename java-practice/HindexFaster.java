import java.util.Scanner;

public class HindexFaster {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Step 1: Fill buckets
        for (int c : citations) {
            if (c >= n)
                count[n]++;
            else
                count[c]++;
        }

        // Step 2: Find h-index
        int papers = 0;
        for (int h = n; h >= 0; h--) {
            papers += count[h];
            if (papers >= h)
                return h;
        }
        return 0;
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
        System.out.println(hIndex(arr));
        sc.close();
    }
}
