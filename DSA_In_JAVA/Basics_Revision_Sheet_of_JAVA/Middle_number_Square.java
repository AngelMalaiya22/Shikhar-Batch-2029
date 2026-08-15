// WAP to take input 3 digit numbers from the user and print the square of the middle digit.
import java.util.Scanner;
public class Middle_number_Square 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int middle = num%100;
        middle = middle/10;
        System.out.println("The square of middle digit is "+ (middle*middle));
    }
}
