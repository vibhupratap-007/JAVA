/*WRITE A JAVA PROGRAM TO TAKE THE RADIUS OF CIRCLE AND FIND ITS CIRCUMFERENCE AND AREA */
import java.util.*;
class circle
{
    public static void main(String[] args)
    {
        double r,a,c;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        r = object.nextDouble();
        a = 3.15*r*r;
        c = 2*3.14*r;
        System.out.println("Area of circle is: "+a);
        System.out.println("Circumference of circle is: "+c);
        object.close();
    }
}
