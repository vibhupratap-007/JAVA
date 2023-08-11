/*WRITE A JAVA PROGRAM TO TAKE NUMBERS FROM THE USER AND DISPLAY THE LAST DIGIT OF THE ENTERED NUMBER */
import java.util.*;
class last
{
    public static void main(String D[])
    {
        int a;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = object.nextInt();
        int b = a % 10;
        System.out.print("Last digit of the entered number is = "+b);
        object.close();
    }
}