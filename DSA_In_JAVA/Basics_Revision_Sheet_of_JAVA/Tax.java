/*
WAP to take income as input from the user and calculate the tax payable according to the following rules:
    - Income <= 10,000: No tax
    - Income > 10,000 and <= 25,000: 10% of income exceeding 10,000
    - Income > 25,000 and <= 50,000: 2,500 + 20% of income exceeding 25,000
    - Income > 50,000: 5,000 + 30% of income exceeding 50,000
 */
import java.util.Scanner;
public class Tax 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your total income: ");
        double income = scanner.nextDouble();

        double tax = 0.0;

        if (income <= 10000) {
            tax = 0.0;
        } else if (income <= 25000) {
            tax = (income - 10000) * 0.10;
        } else if (income <= 50000) {
            tax = 2500 + (income - 25000) * 0.20;
        } else {
            tax = 5000 + (income - 50000) * 0.30;
        }

        System.out.println("Tax Payable: " + tax);

        scanner.close();
    }
}
