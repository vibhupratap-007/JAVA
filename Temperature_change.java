/*WRITE A JAVA PROGRAM TO CONVERT GIVEN FAHRENHEIT TEMPERATURE TO CELSIUS TEMPERATURE */
import java.util.*;
class Temperature_change
{
    public static void main(String args[])
    {
        double f,c;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        f = object.nextDouble();
        c = (f-32)*5/9;
        System.out.println("The temperature in celsius is: "+c);
        object.close();
        }
}