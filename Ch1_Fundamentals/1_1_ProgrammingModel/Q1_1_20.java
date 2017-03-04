

public class Q1_1_20 {

    public static void main(String[] args) {
        System.out.println(Math.log(Math.E));
        System.out.println(ln_j(4));
    }

    public static double ln_j(int N) {
        if (N==1) return 0;
        return (Math.log(N) + ln_j(N-1));
    }

}
