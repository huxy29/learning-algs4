/*************************************************************************
 * 1.1.3 Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 *
*************************************************************************/

public class Q1_1_3{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a==b && b==c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
