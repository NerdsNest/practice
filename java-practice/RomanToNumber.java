import java.util.Scanner;

public class RomanToNumber {
    public static int romanToInt(String s) {
        int n = 0;
        s = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    n += 4;
                    i++; 
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    n += 9;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    n += 40;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    n += 90;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    n += 400;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    n += 900;
                    i++;
                    continue;
                }
            }

            // Single character values
            if (s.charAt(i) == 'I') {
                n += 1;
            } else if (s.charAt(i) == 'V') {
                n += 5;
            } else if (s.charAt(i) == 'X') {
                n += 10;
            } else if (s.charAt(i) == 'L') {
                n += 50;
            } else if (s.charAt(i) == 'C') {
                n += 100;
            } else if (s.charAt(i) == 'D') {
                n += 500;
            } else if (s.charAt(i) == 'M') {
                n += 1000;
            }
        }
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roman number: ");
        String rom=sc.nextLine();
        System.out.println("The number is: "+romanToInt(rom));
        sc.close();
    }
    
}
