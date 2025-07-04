import java.util.*;
 
public class Main {
 
    public static int solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        long totalTwos = 0;
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 2) totalTwos++;
        }
 
        long leftTwos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 2) leftTwos++;
            if (leftTwos == totalTwos - leftTwos) {
                return i + 1; // 1-based index
            }
        }
 
        return -1;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            System.out.println(solve(sc));
        }
 
        sc.close();
    }
}