import java.io.*;
import java.util.*;
 
public class C_Count_Good_Numbers {
    static final int[] BAD = {2, 3, 5, 7};
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
 
            long total = r - l + 1, cnt = 0;
 
            for (int mask = 1; mask < (1 << BAD.length); mask++) {
                long prod = 1;
                int bits = Integer.bitCount(mask);
 
                for (int i = 0; i < BAD.length; i++) {
                    if ((mask & (1 << i)) != 0) {
                        prod *= BAD[i];
                    }
                }
 
                if (prod > r) continue;
 
                long mult = r / prod - (l - 1) / prod;
                cnt += (bits % 2 == 1 ? mult : -mult);
            }
 
            System.out.println(total - cnt);
        }
    }
}