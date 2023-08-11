/*WRITE A JAVA PROGRAM TO CALCULATE THE AREA AND VOLUME OF A CUBOID*/
import java.util.*;
class Volume_Area_cuboid
{
    public static void main(String args[])
    {
        double l,b,h,v,a;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the Length of cuboid: ");
        l = object.nextDouble();
        System.out.println("Enter the breadth of cuboid: ");
        b = object.nextDouble();
        System.out.println("Enter the height of cuboid: ");
        h = object.nextDouble();
        v = l*b*h;
        a = 2*(l*b+b*h+h*l);
        System.out.println("Volume of cuboid is: "+v);
        System.out.println("Area of cuboid is: "+a);
        object.close();
    }
}
