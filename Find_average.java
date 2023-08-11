/*WRITE A JAVA PROGRAM TO TAKE 4 NUMBERS FROM THE USERS AND FIND THEIR AVERAGE */
import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Double a,b,c,d,A;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 4 numbers: ");
        a = obj.nextDouble();
        b = obj.nextDouble();
        c = obj.nextDouble();
        d = obj.nextDouble();
        A = (a+b+c+d)/4;
        System.out.println("The average of 4 numbers is: "+A);
        obj.close();
    }
}