import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        
            Integer[] maxds = new Integer[n];
            for (int i = 0; i < n; i++) {
                long A = a[i];
                int mx = -1;
                for (int d = 0; d < n; d++) {
                    long thresh = c >> d;
                    if (A <= thresh) {
                        mx = d;
                    } else {
                        break;
                    }
                }
                maxds[i] = mx;
            }
            Arrays.sort(maxds); 
            TreeSet<Integer> avail = new TreeSet<>();
            for (int i = 0; i < n; i++) avail.add(i);
            int free = 0;
            for (int i = 0; i < n; i++) {
                int md = maxds[i];
                if (!avail.isEmpty()) {
                    Integer small = avail.first();
                    if (small <= md) {
                        avail.remove(small);
                        free++;
                    }
                }
            }
            System.out.println(n - free);
        }
        sc.close();
    }
}