import edu.princeton.cs.algs4.StdOut;


public class Q1_1_27 {
    public static double binomial(int N, int k, double p) {
        double[][] b = new double[N+1][k+1];
        b[0][0] = 1;
        for (int j=1; j<k+1; j++) b[0][j] = 0;
        for (int i=1; i<N+1; i++) b[i][0] = (1.0-p)*b[i-1][0];
        for (int i=1; i<N+1; i++) {
            for (int j=1; j<k+1; j++)
                b[i][j] = (1.0-p)*b[i-1][j] + p*b[i-1][j-1];
        }
        for (int i=0; i<N+1; i++) {
            for (int j=0; j<k+1; j++){
                StdOut.printf("%8.4f",b[i][j]);
            }
            StdOut.println();
        }
        return b[N][k];
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        StdOut.printf("N=%d  k=%d  p=%f", N, k, p);
        StdOut.println( binomial(N,k,p));
    }
}
