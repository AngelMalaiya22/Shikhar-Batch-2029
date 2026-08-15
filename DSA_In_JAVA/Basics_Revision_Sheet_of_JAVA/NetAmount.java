// WAP to take input rate and quantity and calculate the amount . Finally print net amount to be paid after allowing 15% discount if amount exceed 2000 rs.
import java.util.Scanner;
public class NetAmount 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int rate=sc.nextInt();
        int quautity=sc.nextInt();
        if((rate*quautity) >2000)
        {
            int paid=(rate*quautity)-((rate*quautity)/100*15);
            System.out.println(paid);
        }
    }    
}
