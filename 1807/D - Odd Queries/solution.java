import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
 
            // Prefix sum array (1-based indexing)
            long[] psum = new long[n + 2]; // n+10 not needed, just n+2 is safe
            for (int i = 1; i <= n; i++) {
                psum[i] = psum[i - 1] + arr[i - 1];
            }
 
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
 
                long a = psum[r] - psum[l - 1]; // sum of subarray [l..r]
                long newSum = sum - a + (long) k * (r - l + 1);
 
                if (newSum % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
 
        sc.close();
    }
}