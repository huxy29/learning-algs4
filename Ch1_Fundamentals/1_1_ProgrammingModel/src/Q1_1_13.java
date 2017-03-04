

public class Q1_1_13{
    public static void main(String[] args){
        int[][] m = new int[3][4];
        for(int i=0; i<3; ++i){
            for(int j=0; j<4; ++j){
                m[i][j] = i+j;
            }
        }

        int[][] n = trans(m, 3, 4);
        for(int i=0; i<4; ++i){
            for(int j=0; j<3; ++j){
                System.out.print("\t"+n[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int[][] trans(int[][] m, int M, int N){
        int[][] n = new int[N][M];
        for(int i=0; i<M; ++i){
            for(int j=0; j<N; ++j){
                n[j][i] = m[i][j];
            }
        }

        return n;
    }
}
