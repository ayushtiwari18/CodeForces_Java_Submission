import java.util.*;
 
public class Shashliks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            // Try both orders and return the max
            long max1 = computeMax(k, a, x, b, y);
            long max2 = computeMax(k, b, y, a, x);
            System.out.println(Math.max(max1, max2));
        }
    }
 
    // Compute how many portions we can cook trying type1 first then type2
    static long computeMax(long k, long a1, long d1, long a2, long d2) {
        if (k < a1) return cook(k, a2, d2); // Can't cook type1 at all
        long firstCount = (k - a1) / d1 + 1;
        long tempAfterFirst = k - firstCount * d1;
        long secondCount = cook(tempAfterFirst, a2, d2);
        return firstCount + secondCount;
    }
 
    // Compute how many times we can cook a single type
    static long cook(long k, long a, long d) {
        if (k < a) return 0;
        return (k - a) / d + 1;
    }
}