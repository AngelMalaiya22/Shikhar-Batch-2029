// WAO to take input two numbers from the user and print the largest of them 
import java.util.Scanner;
public class LargestNumber 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("The largest number is: "+num1);
        }
        else
        {
            System.out.println("The largest number is: "+num2);
        }
    }
}
