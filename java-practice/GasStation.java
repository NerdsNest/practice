import java.util.Scanner;

public class GasStation {

    // Method to find the starting gas station
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;   // total gas balance
        int tank = 0;    // current fuel in tank
        int start = 0;   // candidate starting index

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            // If tank becomes negative, current start is invalid
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        // If total gas is enough, return start index; else return -1
        return total >= 0 ? start : -1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of gas stations: ");
        int n = sc.nextInt();

        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter gas values:");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        System.out.println("Enter cost values:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int result = canCompleteCircuit(gas, cost);

        System.out.println("Starting station index: " + result);

        sc.close();
    }
}
