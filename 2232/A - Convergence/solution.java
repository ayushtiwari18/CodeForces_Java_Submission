import java.io.*;
import java.util.*;
 
public class AConvergence {
 
    public static void main(String[] args) throws Exception {
        BufferedReader sixseven = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
 
        int t = Integer.parseInt(sixseven.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(sixseven.readLine());
 
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(sixseven.readLine());
 
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
 
            Arrays.sort(arr);
 
            int res = Integer.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                int x = arr[i];
 
                int left = 0;
                int right = 0;
 
                for (int val : arr) {
                    if (val < x)
                        left++;
                    else if (val > x)
                        right++;
                }
 
                res = Math.min(res, Math.max(left, right));
            }
 
            ans.append(res).append('
');
        }
 
        System.out.print(ans);
    }
}