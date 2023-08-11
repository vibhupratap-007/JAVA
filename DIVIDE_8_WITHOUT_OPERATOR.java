/* WRITE A JAVA PROGRAM TO DIVIDE THE NUMBER BY 8 WITHOUT USING THE ACTUAL DIVISION OPERATOR */
import java.util.*;
class DIVIDE_8_WITHOUT_OPERATOR
{
    public static void main(String D[])
    {
        int a,b;
        Scanner object = new Scanner(System.in);
        System.out.print("Enter the number: ");
        a = object.nextInt();
        b = a>>3;
        System.out.print(b);
        object.close();
    }
}