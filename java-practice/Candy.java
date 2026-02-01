import java.util.*;
public class Candy {

    public static int candy(int[] ratings) {
        int n = ratings.length;

        // Step 1: Each child gets at least 1 candy
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Step 2: Left to Right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum all candies
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of children: ");
        int n = sc.nextInt();

        int[] ratings = new int[n];
        System.out.println("Enter ratings:");
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        System.out.println("Minimum candies needed: " + candy(ratings));
    }
}