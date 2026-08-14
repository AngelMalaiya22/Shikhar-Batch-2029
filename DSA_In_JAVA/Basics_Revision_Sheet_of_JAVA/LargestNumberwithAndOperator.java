// / WAP to take input 3 numbers from the user and print the largest of them using AND operator.
import java.util.Scanner;
public class LargestNumberwithAndOperator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("The largest number is: "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The largest number is: "+num2);
        }
        else
        {
            System.out.println("The largest number is: "+num3);
        }
    }
}
