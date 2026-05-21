import java.io.*;
import java.util.*;
 
public class BAnotherSortingProblem {
 
    static final long INF = (long) 4e18;
 
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
 
    public static void main(String[] args) throws Exception {
 
        FastReader sc = new FastReader();
        StringBuilder ans = new StringBuilder();
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
 
            int n = sc.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
           
            long[][] dp = {
                {1, INF}, 
                {1, INF}  
            };
 
            boolean possible = true;
 
            for (int i = 0; i < n - 1; i++) {
 
                long[][] ndp = {
                    {INF, -1},
                    {INF, -1}
                };
 
                for (int x = 0; x < 2; x++) {
 
                    long curL = dp[x][0];
                    long curR = dp[x][1];
 
                    if (curL > curR) continue;
 
                    for (int y = 0; y < 2; y++) {
 
                        long L = 1, R = INF;
 
                        long ai = a[i];
                        long aj = a[i + 1];
 
                        if (x == y) {
                            if (ai > aj) continue;
 
                        } else if (x == 0 && y == 1) {
                         
                            L = Math.max(1, ai - aj);
 
                        } else {
                          
                            if (ai >= aj) continue;
                            R = aj - ai;
                        }
 
                        long left = Math.max(curL, L);
                        long right = Math.min(curR, R);
 
                        if (left <= right) {
                            ndp[y][0] = Math.min(ndp[y][0], left);
                            ndp[y][1] = Math.max(ndp[y][1], right);
                        }
                    }
                }
 
                dp = ndp;
            }
 
            boolean ok = dp[0][0] <= dp[0][1] ||
                         dp[1][0] <= dp[1][1];
 
            ans.append(ok ? "YES
" : "NO
");
        }
 
        System.out.print(ans);
    }
}