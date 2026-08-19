// WAP to print the sum of the divisors of a number given by user.

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of divisors of " + num + " is: " + sum);

        sc.close();
    }
}
