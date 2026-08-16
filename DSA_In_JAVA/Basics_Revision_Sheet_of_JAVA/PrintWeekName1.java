// Wap to take input (range 1 to 7) from the user and print the corresponding week using if else .
import java.util.Scanner;
public class PrintWeekName1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Monday");
        }
        else if(choice ==2)
        {
            System.out.println("Tuesday");
        }
        else if(choice == 3)
        {
            System.out.println("Wednesday");
        }
        else if(choice ==4)
        {
            System.out.println("Thrusday");
        }
        else if(choice == 5)
        {
            System.out.println("Friday");
        }
        else if(choice ==6)
        {
            System.out.println("Saturday");
        }
        else if(choice ==7)
        {
            System.out.println("Sunday");
        }
    }    
}
