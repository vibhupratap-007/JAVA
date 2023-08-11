/*WRIITE A JAVA PROGRAM TO SWAP 2 NUMBERS USING THE THIRD VARIABLE */
import java.util.*;
class Swap_2_numbers
{
    public static void main(String G[])
    {
        Double a,b,c;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = object.nextDouble();
        System.out.print("Enter the second number: ");
        b = object.nextDouble();
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        object.close();
    }
}