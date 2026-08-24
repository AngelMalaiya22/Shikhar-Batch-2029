import java.util.Scanner;

public class Vehicle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\nWelcome to the Vechile Showroom");
        System.out.println("-----MENU-------");
        System.out.println("Enter the Types of Vechile you want to see : ");
        System.out.println("\n 1.Enter 1 for 4 WheelVechile \n2.Enter 2 for 2 WheelVehicle");
        System.out.print("Enter your Choice : ");
        int v=sc.nextInt();
        int choice=0;

        if(v == 1)
        {
            System.out.println("Enter 1 for TATA");
            System.out.println("Enter 2 for Hyundai Motor");
            int company = sc.nextInt();

            if(company == 1)
            {
                System.out.println("Enter 1 for Nexon");
                System.out.println("Enter 2 for Harrier");
                int carName = sc.nextInt();

                if(carName == 1)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Nexon \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Nexon \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Nexon \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
                else if(carName == 2)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Harrier \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Harrier \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TATA\n Chosen Car: Harrier \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
                else
                {
                    System.out.println("You entered wrong Choice ");
                }
            }
            else if(company == 2)
            { 
                System.out.println("Enter 1 for Super Cub");
                System.out.println("Enter 2 for Activa");
                int bikeName = sc.nextInt();
                if(bikeName == 1)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                }
                else if(bikeName == 2)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                }
                else
                {
                    System.out.println("You entered wrong Choice ");
                }
            }
            else
            {
                System.out.println("You entered wrong Choice ");
            }
        }
        else if(v == 2)
        {
            System.out.println("Enter 1 for Hero");
            System.out.println("Enter 2 for TVS");
            int company = sc.nextInt();
            if(company == 1)
            {
                System.out.println("Enter 1 for Splendor Plus");
                System.out.println("Enter 2 for HF Deluxe");
                int bikename=sc.nextInt();
                if( bikename == 1)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: Splendor Plus \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: Splendor Plus \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: Splendor Plus \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
                else if(bikename == 2)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: HF Deluxe \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: HF Deluxe \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: Hero\n Chosen Car: HF Deluxe \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
            } 
            else if(company == 2)
            {
                System.out.println("Enter 1 for Apache RTR 160");
                System.out.println("Enter 2 for Jupiter");
                int bikename=sc.nextInt();
                if( bikename == 1)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Apache RTR 160 \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Apache RTR 160 \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Apache RTR 160 \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
                else if(bikename == 2)
                {
                    System.out.println("Enter the 1 for petrol");
                    System.out.println("Enter 2 for Desial ");
                    System.out.println("Enter 3 for CNG");
                    int p = sc.nextInt();
                    if(p == 1)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Jupiter \n He wants it in petrol type");
                    }
                    else if(p == 2)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Jupiter \n He wants it in Desial type");
                    }
                    else if(p == 3)
                    {
                        System.out.println("\n\n Final Choice of User is : \n Company Name: TVS\n Chosen Car: Jupiter \n He wants it in CNG type");
                    }
                    else
                    {
                        System.out.println("Invalid Choice");
                    }
                }
            } 
        }
        else
        {
            System.out.println("You entered wrong Choice ");
        }

    }
}