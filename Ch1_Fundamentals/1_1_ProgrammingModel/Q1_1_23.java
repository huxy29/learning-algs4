import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;


public class Q1_1_23 {

    public static int rank(int key, int a[]) {
        int lo = 0;
        int hi = a.length - 1;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (key>a[mid]) lo = mid + 1;
            else if (key<a[mid]) hi = mid - 1;
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        String flag = args[0];
        int[] whitelist = In.readInts(args[1]);
        Arrays.sort(whitelist);
        if (flag.equals("+"))
            StdOut.println("not in whitelist:");
        if (flag.equals("-"))
            StdOut.println("in whitelist:");
        while(!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (flag.equals("+") && rank(key, whitelist)<0)
                StdOut.println(key);
            if (flag.equals("-") && rank(key, whitelist)>=0)
                StdOut.println(key);
        }
    }
}
