// WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Even numbers between " + lower + " and " + upper + ":");

        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
