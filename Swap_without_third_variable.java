/*WRITE A JAVA PROGRAM TO SWAP 2 NUMBERS WITHOUT USING THE THIRD VARIABLE  */
import java.util.*;
class Swap_without_third_variable
{
    public static void main(String I[])
    {
        Integer a,b;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = object.nextInt();
        System.out.println("Enter the value of b: ");
        b = object.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print("a = "+a);
        System.out.print("b = "+b);
        object.close();
    }
}
