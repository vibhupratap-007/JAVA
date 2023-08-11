/*WRITE A PROGRAM THAT READS A CHARACTER FROM THE USER */
class ch
{
    public static void main(String K[]) throws Exception
    {
        char ch;
        System.out.print("Enter a character: ");
        ch = (char) System.in.read();
        System.out.println(ch);
    }
}