

public class Q1_1_19 {

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F(N));
        }

        long[] ans = FF(100);
        for(int i=0; i<100; ++i){
            System.out.println(i + " " + ans[i]);
        }
    }

    public static long F(int N) {
        long a = 0;
        long b = 1;
        long c = 0;
        if (N==0) return a;
        if (N==1) return b;
        while (N-2>=0) {
            c = a + b;
            a = b;
            b = c;
            N--;
        }
        return c;
    }

    public static long[] FF(int N) {
        long[] ans = new long[N+1];
        if (N==0) {
            ans[0] = 0;
        }
        if (N==1) {
            ans[0] = 0;
            ans[1] = 1;
        }
        if (N>=2) {
            ans[0] = 0;
            ans[1] = 1;
            for(int i=2; i<N+1; ++i) {
                ans[i] = ans[i-1] + ans[i-2];
            }
        }
        return ans;
    }

}
