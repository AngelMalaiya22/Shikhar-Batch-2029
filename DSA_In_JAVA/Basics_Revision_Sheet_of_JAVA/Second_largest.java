// Wap to take input 3 numbers and print the 2nd largest number among them
import java.util.Scanner;
public class Second_largest 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int max=0;
        if(num1 > num2 && num1>num3)
        {
            max=num1;
        }
        else if(num2>num1 && num2>num3)
        {
            max=num2;
        }
        else if(num3>num1 && num3>num2)
        {
            max=num3;
        }
        int secondmax=0;
        if(num1>num2 || num1>num3 && num1<max)
        {
            secondmax= num1;
        }
        else if(num2>num1 || num2>num3 && num1<max)
        {
            secondmax=num2;
        }
        else if(num3>num1 || num3>num2 && num3<max)
        {
            secondmax=num3;
        }
        System.out.print("Second largest elements is "+ secondmax);
    }    
}
