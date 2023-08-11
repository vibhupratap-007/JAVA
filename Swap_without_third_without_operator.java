/*WRITE A JAVA PROGRAM TO SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE AND WITHOUT USING OPERATOR*/
import java.util.*;
class Swap_without_third_without_operator
{
    public static void main(String L[])
    {
        Scanner object = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a: ");
        a = object.nextInt();
        System.out.print("Enter the value of b: ");
        b = object.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        object.close();
    }
}
