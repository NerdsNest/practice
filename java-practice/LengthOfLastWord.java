import java.util.Scanner;
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int n = s.length() - 1;

        while (n >= 0) {
            if (Character.isWhitespace(s.charAt(n))) {
                n--; // skip trailing spaces
            } 
            else {
                // count characters of the last word
                while (n >= 0 && !Character.isWhitespace(s.charAt(n))) {
                    count++;
                    n--;
                }
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        LengthOfLastWord obj = new LengthOfLastWord();
        int result = obj.lengthOfLastWord(input);

        System.out.println("Length of the last word: " + result);

        sc.close();
    }
}