import edu.princeton.cs.algs4.StdOut;

public class EqualKeys {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length-1;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (key>a[mid]) lo = mid + 1;
            else if (key<a[mid]) hi = mid - 1;
            else {
                while(mid>=0 && a[mid]==key){
                    mid--;
                }
                return mid+1;
            }
        }
        return -1;
    }

    public static int count(int key, int[] a) {
        int lo = 0;
        int hi = a.length-1;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (key>a[mid]) lo = mid + 1;
            else if (key<a[mid]) hi = mid - 1;
            else {
                int left = mid;
                int right = mid;
                while(left>=0 && a[left]==key)
                    left--;
                while(right<=a.length-1 && a[right]==key)
                    right++;
                return right-left-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,4,5,6,6,6,6,7,8,8,9};
        for (int i=0; i<a.length; i++) StdOut.print(a[i]+" ");
        StdOut.println();
        int key = Integer.parseInt(args[0]);
        StdOut.printf("key rank: %d\n", rank(key, a));
        StdOut.printf("key count: %d\n", count(key, a));
    }

}
