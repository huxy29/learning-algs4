

public class Q1_1_15{

    public static void main(String[] args){

        int[] a = {0,1,2,3,4,5,6,7,8,2,2,3,3,3,3,3,4,4,9,6,6,6,6};
        int M = 10;
        int[] result = histogram(a, M);
        for(int i=0; i<result.length; ++i){
            System.out.println(result[i]);
        }
    }

    public static int[] histogram(int[] a, int M){
        int N = a.length;
        int[] result = new int[M];
        for(int i=0; i<N; ++i){
            result[a[i]]++;
        }
        return result;
    }

}
