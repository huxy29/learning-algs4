import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;


public class Euclid {

    public static long euclid(long p, long q) {
        if (q>p) {
            p = p+q;
            q = p-q;
            p = p-q;
        }
        StdOut.printf("p = %d, q = %d\n", p, q);
        if (p%q == 0) return q;
        return euclid(q, p%q);
    }

    public static void main(String[] args) {
        long p = StdIn.readLong();
        long q = StdIn.readLong();
        StdOut.println(euclid(p, q));
    }

}
