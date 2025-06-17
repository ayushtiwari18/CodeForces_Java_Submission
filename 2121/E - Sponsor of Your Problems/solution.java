import java.util.*;
 
public class E_Sponsor_of_Your_Problems {
    static final int INF = 1_000_000_000;
 
    public static int solveOne(String L, String R) {
        int m = L.length();
        int[][][] dp = new int[m + 1][2][2];
        for (int i = 0; i <= m; i++)
            for (int a = 0; a < 2; a++)
                Arrays.fill(dp[i][a], INF);
 
        dp[0][1][1] = 0;
 
        for (int pos = 0; pos < m; pos++) {
            for (int tL = 0; tL < 2; tL++) {
                for (int tR = 0; tR < 2; tR++) {
                    int cur = dp[pos][tL][tR];
                    if (cur >= INF) continue;
 
                    int lo = tL == 1 ? L.charAt(pos) - '0' : 0;
                    int hi = tR == 1 ? R.charAt(pos) - '0' : 9;
 
                    for (int d = lo; d <= hi; d++) {
                        int add = (d == L.charAt(pos) - '0' ? 1 : 0)
                                + (d == R.charAt(pos) - '0' ? 1 : 0);
                        int ntL = (tL == 1 && d == lo) ? 1 : 0;
                        int ntR = (tR == 1 && d == hi) ? 1 : 0;
                        dp[pos + 1][ntL][ntR] = Math.min(dp[pos + 1][ntL][ntR], cur + add);
                    }
                }
            }
        }
 
        int ans = INF;
        for (int tL = 0; tL < 2; tL++)
            for (int tR = 0; tR < 2; tR++)
                ans = Math.min(ans, dp[m][tL][tR]);
 
        return ans;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String L = sc.next(), R = sc.next();
            System.out.println(solveOne(L, R));
        }
        sc.close();
    }
}