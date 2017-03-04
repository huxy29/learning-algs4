

public class Q1_1_10{
    public static void main(String[] args){
        int N = 20;
        System.out.print("\t");
        for(int i=0; i<N; ++i)
            System.out.printf((i+1)+"\t");
        System.out.print("\n");
        for(int i=0; i<N; ++i){
            System.out.print(i+1);
            for(int j=0; j<N; ++j){
                if(i%2==0 && j%2==0)
                    System.out.print("\t*");
                else
                    System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
