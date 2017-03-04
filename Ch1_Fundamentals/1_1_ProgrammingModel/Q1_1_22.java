import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Q1_1_22 {

    public static void main(String[] agrs) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,12,14,15,16,18,19,24,26,28,45,56,78,90};
        int key = 45;
        StdOut.print("\t");
        for(int i=0; i<a.length; ++i) StdOut.printf("%d\t", i);
        StdOut.println();
        StdOut.println(rank(key, a, 0, a.length-1, 1));
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {
        if(lo>hi) return -1;
        int i;
        StdOut.printf("deep:%d\t", deep);
        for (i=0; i<lo; i++) StdOut.print("__\t");
        if (lo<hi) {
            StdOut.print("lo\t");
            for (i=lo+1; i<hi; ++i) StdOut.print("__\t");
            StdOut.print("hi\t");
        }
        else StdOut.print("lo/hi\t");
        for (i=hi+1; i<a.length; ++i) StdOut.print("__\t");
        StdOut.println();
        int mid = (lo + hi) / 2;
        if (key<a[mid])      return rank(key, a, lo, mid-1, deep+1);
        else if (key>a[mid]) return rank(key, a, mid+1, hi, deep+1);
        else                 return mid;
    }

}
