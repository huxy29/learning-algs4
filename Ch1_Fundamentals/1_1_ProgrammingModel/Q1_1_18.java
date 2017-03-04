

public class Q1_1_18 {

    public static void main(String[] args) {
        System.out.println(m(2, 25) + "  " + m(3, 11));
        System.out.println(n(2, 25) + "  " + n(3, 11));
    }

    public static int m(int a, int b){
        if(b==0) return 0;
        if(b%2==0) return m(2*a, b/2);
        return m(2*a, b/2) + a;
    }

    public static int n(int a, int b){
        if(b==0) return 1;
        if(b%2==0) return n(a*a, b/2);
        return n(a*a, b/2) * a;
    }

}
