import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 1. Reversing the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // 2. Checking for palindrome (case-insensitive)
        boolean isPalindrome = str.equalsIgnoreCase(reversed);

        // 3. Counting vowels
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Reversed String: " + reversed);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Number of Vowels: " + vowelCount);

        scanner.close();
    }
}