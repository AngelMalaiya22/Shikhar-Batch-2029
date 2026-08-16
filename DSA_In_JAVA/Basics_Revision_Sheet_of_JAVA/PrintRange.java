// WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.

import java.util.Scanner;

public class PrintRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Numbers between " + lower + " and " + upper + ":");
        
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}