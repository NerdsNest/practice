import java.util.*;

public class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random rand;

    // Constructor
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    // Insert operation
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    // Remove operation
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    // Get random element
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }

    // Main method (USER INPUT)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomizedSet rs = new RandomizedSet();

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Get Random");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertVal = sc.nextInt();
                    System.out.println(rs.insert(insertVal));
                    break;

                case 2:
                    System.out.print("Enter value to remove: ");
                    int removeVal = sc.nextInt();
                    System.out.println(rs.remove(removeVal));
                    break;

                case 3:
                    if (rs.list.isEmpty()) {
                        System.out.println("Set is empty!");
                    } else {
                        System.out.println("Random value: " + rs.getRandom());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
