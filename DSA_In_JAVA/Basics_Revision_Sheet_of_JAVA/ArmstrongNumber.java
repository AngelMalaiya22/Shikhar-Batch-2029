// WAP to take input a number from the user and check whether it is armstrong.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int temp = num;
        int digits = 0;
        double sum = 0;

        // Step 1: Count total number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num; // Reset temp to calculate digit powers

        // Step 2: Calculate sum of (digit ^ digits)
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Step 3: Check if sum equals original number
        if ((int) sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
