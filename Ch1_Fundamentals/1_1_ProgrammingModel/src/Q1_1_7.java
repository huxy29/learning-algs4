

public class Q1_1_7{
    public static void main(String[] args){
        double t = 25.0;
        while(Math.abs(t-25.0/t)>.001)
            t= (t+25.0/t)/2.0;
        System.out.printf("%.5f\n", t);

        int sum = 0;
        for(int i=1; i<1000; ++i){
            for(int j=0; j<i; ++j){
                sum++;
            }
        }
        System.out.println(sum);

        sum = 0;
        for(int i=1; i<1000; i*=2){
            for(int j=0; j<1000; j++){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
