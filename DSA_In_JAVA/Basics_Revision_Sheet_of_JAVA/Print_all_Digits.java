// WAP to take input 4 digit numbers from the user and print its all digits.
import java.util.*;
public class Print_all_Digits 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int d=0;
        while(num>0)
        {
            d=num%10;
            System.out.println(d);
            num/=10;
        }
    }
}
