import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Q1_1_31 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.01);
        StdDraw.circle(50, 50, 30);


        double[] x = new double[N];
        double[] y = new double[N];

        for (int i=0; i<N; i++) {
            x[i] = 50 + 30*Math.cos(2*Math.PI*i/N);
            y[i] = 50 + 30*Math.sin(2*Math.PI*i/N);
            StdDraw.circle(x[i], y[i], 2);
        }

        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (StdRandom.uniform()<=p)
                    StdDraw.line(x[i], y[i], x[j], y[j]);
            }
        }

    }

}
