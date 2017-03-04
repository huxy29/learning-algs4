import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_1_21 {

    public static void main(String[] args) {
        String name = "";
        int num1;
        int num2;
        double div;
        while(!StdIn.isEmpty()) {
            name = StdIn.readString();
            num1 = StdIn.readInt();
            num2 = StdIn.readInt();
            div = (double)num1/num2;
            StdOut.printf("%-16s %-4d %-4d %-8.3f\n", name, num1, num2, div);
        }
    }

}
