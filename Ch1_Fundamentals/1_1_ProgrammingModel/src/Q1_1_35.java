import edu.princeton.cs.algs4.*;


public class Q1_1_35 {

    public static double[] accurate() {
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for(int i=1; i<=SIDES; i++)
            for(int j=1; j<=SIDES; j++)
                dist[i+j]++;
        for(int k=2; k<=2*SIDES; k++)
            dist[k]/=36.0;
        return dist;
    }

    public static boolean compare(double[] accurate, double[] simulation, double e) {
        int M = accurate.length;
        int N = simulation.length;
        if (M!=N) {
            StdOut.println("Error!");
            return true;
        }
        for (int i=0; i<N; i++)
            if (Math.abs(accurate[i]-simulation[i])>=e)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int N = 0;
        int SIDES = 6;
        double e = 0.01;
        int[] dist = new int[2*SIDES+1];
        double[] simulation = new double[2*SIDES+1];
        double[] accurate = accurate();

        do {
            int x = StdRandom.uniform(1, 7);
            int y = StdRandom.uniform(1, 7);
            dist[x+y]++;
            N++;
            for (int i=2; i<=2*SIDES; i++)
                simulation[i] = dist[i]/(N+0.0);
        } while (!compare(accurate, simulation, e));

        StdOut.println("N="+N);
    }

}
