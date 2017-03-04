import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdDraw;

public class Q1_1_32 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        int[] a = new int[N];
        while (!StdIn.isEmpty()) {
            double in = StdIn.readDouble();
            int index = (int)(N * in / (r-l));
            a[index]++;
        }

        StdDraw.setXscale(0,20);
        StdDraw.setYscale(0,20);
        StdDraw.setPenRadius(0.05);

        for(int i = 0; i<N; i++){
            double x = l + i*(r-l)/N;
            double y = a[i]/2.0;
            double rw = 0.5*(r-l)/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);

        }
    }

}

