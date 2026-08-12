// P06 — Temperature Converter
import java.util.Scanner;
public class P06 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        double celsius = sc.nextDouble();
        double ans1 = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + ans1 + "°F");
        System.out.print("Enter Fahrenheit : ");
        double fahrenheit = sc.nextDouble();
        double ans2 = (fahrenheit - 32) * 5/9;  
        System.out.print(fahrenheit + "°F = " + ans2 + "°C");
    }
}
