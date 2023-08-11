/*WRITE A JAVA PROGRAM TO ADD TWO NUMBERS */
import java.util.*;
class sum
{   public static void main(String[] args)
    {
        int a,b,c;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number for a: ");
        System.out.println("Enter the number for b: ");
        a = ob.nextInt();
        b = ob.nextInt();
        c = a+b;
        System.out.print("Sum of two number is: "+c);
        ob.close();
    }
}