/*WRITE A JAVA PROGRAM TO SWAP 2 NUMBERS WITHOUT USING THIRD VARIABLE AND USING ONLY ONE LINE */
import java.util.*;
class swap
{
    public static void main(String P[])
    {
        Double a,b;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = object.nextDouble();
        System.out.print("Enter the value of b: ");
        b = object.nextDouble();
        a = (a+b) - (b-a);
        System.out.print("a = "+a);
        object.close();
    }
}