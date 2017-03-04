import edu.princeton.cs.algs4.*;


public class ShuffleTest {

    public static void test (int M, int N, String flag) {
        int[] a = new int[M];
        int[][] ans = new int[M][M];
        for (int k=0; k<N; k++){
            for (int i=0; i<M; i++)
                a[i] = i;
            shuffle(a, flag);
            for (int i=0; i<M; i++)
                ans[a[i]][i]++;
        }

        for (int i=0; i<M; i++) {
            for (int j=0; j<M; j++) {
                StdOut.print(ans[i][j]+"\t");
            }
            StdOut.println();
        }

    }

    public static void shuffle (int[] a, String flag) {
        int N = a.length;
        int r = 0;
        for (int i=0; i<N; i++) {
            // good shuffling
            if (flag.equals("good"))
                r = i + StdRandom.uniform(N-i);

            // Bad shuffling
            else if (flag.equals("bad"))
                r = StdRandom.uniform(N);

            else
                StdOut.println("flag not match!");

            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);
        String flag = args[2];
        test(M, N, flag);
    }

}
