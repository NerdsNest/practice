import java.util.Scanner;

public class ReversedWordsInString {

    public static String reverseWords(String s) {
        // Step 1: remove leading & trailing spaces and split by one-or-more spaces
        String[] words = s.trim().split("\\s+");

        // Step 2: reverse the words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            // add space only between words
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        String output = reverseWords(s);
        System.out.println("Reversed string:");
        System.out.println(output);

        sc.close();
    }

    
}
