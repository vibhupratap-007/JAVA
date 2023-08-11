/*WRITE A JAVA PROGRAM THAT READS A STRING FROM USER AND DISPLAY IT WITH "HELLO" */
import java.util.*;
class display
{
    public static void main(String D[])
    {
        Scanner object = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p = object.nextLine();
        System.out.print("Hello "+p);
        object.close();
    }
}