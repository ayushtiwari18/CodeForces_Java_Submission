import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] v = new long[n];
 
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }
 
            int ans = 0;
            for (int i = 0; i + 1 < n; i++) {
                if (v[i] % 2 == v[i + 1] % 2) {
                    v[i + 1] = Math.max(v[i], v[i + 1]);
                    ans++;
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}