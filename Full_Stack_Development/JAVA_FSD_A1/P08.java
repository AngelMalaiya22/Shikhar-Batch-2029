// P08 — Odd/Even & Last Digit - Using the ternary operator 
import java.util.Scanner;
public class P08 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        int lastDigit = Math.abs(num) % 10;
        System.out.println("Last Digit : " + lastDigit);
    }
}
