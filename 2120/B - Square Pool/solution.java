import java.io.*;
import java.util.*;
 
public class B_Square_Pool {
 
    static long mod(long a, long m) {
        a %= m;
        if (a < 0) a += m;
        return a;
    }
 
    static long[] extendedGCD(long a, long b) {
        if (b == 0) return new long[]{a, 1, 0};
        long[] res = extendedGCD(b, a % b);
        long g = res[0];
        long x = res[2];
        long y = res[1] - (a / b) * res[2];
        return new long[]{g, x, y};
    }
 
    static boolean solveCRT(long a1, long m1, long a2, long m2) {
        long[] egcd = extendedGCD(m1, m2);
        long g = egcd[0], x = egcd[1], y = egcd[2];
        if ((a2 - a1) % g != 0) return false;
        long lcm = m1 / g * m2;
 
        long t = a1 + ((a2 - a1) / g * x % (m2 / g)) * m1;
        t = mod(t, lcm);
        return true;
    }
 
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
 
        while (t-- > 0) {
            int n = fr.nextInt();
            int s = fr.nextInt();
 
            int count = 0;
            for (int i = 0; i < n; i++) {
                int dx = fr.nextInt();
                int dy = fr.nextInt();
                int x = fr.nextInt();
                int y = fr.nextInt();
 
                long r1 = mod(-1L * dx * x, s);
                long r2 = mod(-1L * dy * y, s);
 
                if (solveCRT(r1, s, r2, s)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
 
    // Fast input reader
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
    }
}