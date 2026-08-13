// WAP to take input rupees from the user and convert it into paise.
import java.util.*;
public class ConvertIntoPaise 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double rupees=sc.nextDouble();
        int paise=(int)(rupees*100);
        System.out.println("The amount in paise is "+ paise);
    }
}
