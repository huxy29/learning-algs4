import edu.princeton.cs.algs4.StdOut;

public class Matrix {

    private Matrix() {  }

    /**
     * Return vector dot product.
     *
     * @param x vector
     * @param y vector
     * @return dot product of x and y
     */
    public static double dot(double[] x, double[] y) {
        double ans = 0.0;
        int N = x.length;
        for (int i=0; i<N; i++) {
            ans += x[i] * y[i];
        }
        return ans;
    }

    /**
     * Return matrix-matrix product.
     * @param a matrix
     * @param b matrix
     * @return product of a and b
     **/
    public static double[][] mult(double[][] a, double[][] b) {
        int M = a.length;
        int N = a[0].length;
        int P = b.length;
        int Q = b[0].length;
        if (N!=P) {
            StdOut.println("Error!");
            return null;
        }
        double[][] ans = new double[M][Q];
        for (int i=0; i<M; i++) {
            for (int j=0; j<Q; j++) {
                for (int k=0; k<N; k++) {
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return ans;
    }

    /**
     * Return transpose of a.
     *
     * @param a matrix
     * @return transepose of a
     **/
    public static double[][] transpose(double[][] a) {
        int M = a.length;
        int N = a[0].length;
        double[][] ans = new double[N][M];
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                ans[j][i] = a[i][j];
            }
        }
        return ans;
    }

    /**
     * Return matrix-vector product.
     *
     * @param a matrix
     * @param x vector
     * @return product of a and x
     **/
    public static double[] mult(double[][] a, double[] x) {
        int M = a.length;
        int N = a[0].length;
        int P = x.length;
        if (N!=P) {
            StdOut.println("Error!");
            return null;
        }
        double[][] xx = new double[P][1];
        for (int i=0; i<P; i++)
            xx[i][0] = x[i];
        double[][] anss = mult(a, xx);
        double[] ans = new double[M];
        for (int i=0; i<M; i++)
            ans[i] = anss[i][0];
        return ans;
    }

    /**
     * Return vector-matrix product.
     *
     * @param y vector
     * @param a matrix
     * @return product of y and a
     **/
    public static double[] mult(double[] y, double[][] a) {
        int N = y.length;
        int P = a.length;
        int Q = a[0].length;
        if (N!=P) {
            StdOut.println("Error!");
            return null;
        }
        double[][] yy = new double[1][N];
        for (int i=0; i<N; i++)
            yy[0][i] = y[i];
        double[][] anss = mult(yy, a);
        double[] ans = new double[Q];
        for (int i=0; i<N; i++)
            ans[i] = anss[0][i];
        return ans;
    }

    public static void main(String[] args) {
        double[] x = {1,2};
        double[] y = {3,4};
        StdOut.print("x=");
        printVector(x);
        StdOut.print("y=");
        printVector(y);
        StdOut.println("dot(x,y)=" + dot(x, y));

        double[][] a = {
            {1,2},
            {3,4}
        };
        double[][] b = {
            {2,4},
            {1,3}
        };
        StdOut.println("==========");
        StdOut.println("a=");
        printMatrix(a);
        StdOut.println("b=");
        printMatrix(b);
        StdOut.println("mult(a, b)=");
        printMatrix(mult(a, b));
        StdOut.println("transpose(a)=");
        printMatrix(transpose(a));
        StdOut.println("mult(a, x)=");
        printVector(mult(a, x));
        StdOut.println("mult(y, a)=");
        printVector(mult(y, a));

    }

    /**
     * Print vecotr
     * @param x vector
     **/
    public static void printVector(double[] x) {
        for (int i=0; i<x.length; i++) {
            StdOut.print(x[i] + "\t");
        }
        StdOut.println();
    }

    /**
     * Print matrix
     * @param a matrix
     **/
    public static void printMatrix(double[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                StdOut.print(a[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}
