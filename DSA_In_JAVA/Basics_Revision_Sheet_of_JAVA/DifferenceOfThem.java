// WAP to take two numbers as input and print the difference of them.
import java.util.Scanner;
public class DifferenceOfThem 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int difference=num1-num2;
        System.out.println("The difference of the two numbers is: "+difference);
    }
}
