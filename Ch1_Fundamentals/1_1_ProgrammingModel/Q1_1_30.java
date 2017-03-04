import edu.princeton.cs.algs4.StdOut;


public class Q1_1_30 {
    public static boolean prime(int i, int j) {
        if (i==j) return true;
        if (i<j) {
            i = i + j;
            j = i - j;
            i = i - j;
        }
        while(i%j!=0){
            int r = i%j;
            i = j;
            j = r;
        }
        if (j==1) return true;
        else return false;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[][] a = new boolean[N][N];
        StdOut.print("\t");
        for (int i=1; i<N; i++)
            StdOut.print(i+"\t");
        StdOut.println();
        for (int i=1; i<N; i++){
            StdOut.print(i+"\t");
            for (int j=1; j<N; j++){
                a[i][j] = prime(i, j);
                StdOut.print(a[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}
