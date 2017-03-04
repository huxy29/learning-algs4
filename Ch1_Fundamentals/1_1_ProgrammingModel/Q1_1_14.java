

public class Q1_1_14{

    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        System.out.println(lg(N));
    }


    public static int lg(int N){
        int k = -1;
        for(int i=1; i<=N; i*=2)
            k++;
        return k;
    }
}
