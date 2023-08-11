/*WRITE A JAVA PROGRAM THAT MULTIPLES THE NUMBER BY 16 WITHOUT USING MULTIPLY OPERATOR  */
import java.util.*;
class multiply
{
    public static void main(String M[])
    {
        int a;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = object.nextInt();
        int b = a<<4;
        System.out.print(b);
        object.close();
    }
}