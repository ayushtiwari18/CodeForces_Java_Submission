import java.io.*;
import java.util.*;
 
public class BCakeLeveling {
 
    public static void main(String[] args) throws Exception {
        BufferedReader sixseven = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
 
        int t = Integer.parseInt(sixseven.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(sixseven.readLine());
 
            StringTokenizer st = new StringTokenizer(sixseven.readLine());
 
            long prefix = 0;
            long minHeight = Long.MAX_VALUE;
 
            for (int i = 1; i <= n; i++) {
                long val = Long.parseLong(st.nextToken());
                prefix += val;
 
                long current = prefix / i;
                minHeight = Math.min(minHeight, current);
 
                ans.append(minHeight).append(' ');
            }
 
            ans.append('
');
        }
 
        System.out.print(ans);
    }
}