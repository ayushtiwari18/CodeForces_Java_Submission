import java.util.*;
 
public class Main {
    static final int N = 100005;
    static final int MOD = 998244353;
    static int[] s = new int[N];
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s[0] = 1;
        for (int i = 1; i < N; i++) {
            s[i] = (s[i - 1] * 2) % MOD;
        }
 
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
 
    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
 
        for (int i = 0; i < n; i++) p[i] = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
 
        int i = 0, j = 0;
        for (int k = 0; k < n; k++) {
            if (p[k] > p[i]) i = k;
            if (q[k] > q[j]) j = k;
 
            if (p[i] != q[j]) {
                if (p[i] > q[j]) {
                    System.out.print((s[p[i]] + s[q[k - i]]) % MOD + " ");
                } else {
                    System.out.print((s[q[j]] + s[p[k - j]]) % MOD + " ");
                }
            } else {
                int maxVal = Math.max(q[k - i], p[k - j]);
                System.out.print((s[p[i]] + s[maxVal]) % MOD + " ");
            }
        }
        System.out.println();
    }
}