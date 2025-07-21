import java.util.Scanner;
 
public class Main {
 
    static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
            long g = 0;
 
            for (int p = 1; p <= n; p++) {
                long x = sc.nextLong();
                long diff = Math.abs(p - x);
                g = gcd(g, diff);
            }
 
            System.out.println(g);
        }
 
        sc.close();
    }
}