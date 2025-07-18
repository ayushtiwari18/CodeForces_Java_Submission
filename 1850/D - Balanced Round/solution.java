import java.util.*;
 
public class Main {
 
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
 
        Arrays.sort(arr);
 
        int curr = 1, total = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) <= k) {
                curr++;
            } else {
                total = Math.max(total, curr);
                curr = 1;
            }
        }
 
        total = Math.max(total, curr);
 
        System.out.println(n - total);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
    }
}