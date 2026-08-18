// WAP to take input 2 numbers from the user and print the sum of the numbers.
import java.util.Scanner;
public class Sum_Of_Numbers
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of a and b is "+ (a+b));
    }
}