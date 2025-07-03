import java.util.*;
 
public class Main {
 
    // Function to check if array is beautiful
    public static boolean beautiful(int[] a, int n) {
        int g = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                g = Math.min(g, gcd(a[i], a[j]));
            }
        }
 
        return g <= 2;
    }
 
    // GCD helper function
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();  // Array size
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            if (beautiful(a, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}