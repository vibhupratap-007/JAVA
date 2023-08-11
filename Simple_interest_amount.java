/*WRITE A JAVA PROGRAM TO FIND THE SIMPLE INTEREST AND AMOUNT */
import java.util.*;
class Simple_interest_amount
{
    public static void main(String K[])
    {
        Double p,r,t,SI,Amount;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        p = object.nextDouble();
        System.out.print("Enter the rate: ");
        r = object.nextDouble();
        System.out.print("Enter the time: ");
        t = object.nextDouble();
        SI = (p*r*t)/100;
        Amount = p+SI;
        System.out.println("Simple Interest Amount: "+SI);
        System.out.println("Amount: "+Amount);
        object.close();
    }
}