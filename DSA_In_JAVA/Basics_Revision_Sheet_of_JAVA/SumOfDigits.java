// WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
import java.util.Scanner;
public class SumOfDigits 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=num%10;
        int d=0;
        while(num>0)
        {
            d=num%10;
            num/=10;
        }
        sum=sum+d;
        System.out.println("The sum of 1st and 3rd digit is "+ sum);
    }
}
