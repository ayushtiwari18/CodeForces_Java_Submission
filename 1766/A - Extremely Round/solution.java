import java.util.*;
 
public class ExtremelyRound {
 
    static int[] v = new int[1_000_001]; // Precomputed answers
 
    public static void precompute() {
        for (int i = 1; i <= 999999; i++) {
            int n = i;
            int countNonZeroDigits = 0;
 
            while (n > 0) {
                if (n % 10 != 0) countNonZeroDigits++;
                n /= 10;
            }
 
            if (countNonZeroDigits == 1) {
                v[i] = v[i - 1] + 1;
            } else {
                v[i] = v[i - 1];
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        precompute(); // Build the prefix array once
 
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int num = sc.nextInt();
            System.out.println(v[num]);
        }
 
        sc.close();
    }
}