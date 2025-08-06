import java.util.Scanner;
 
public class Main {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
 
    public static long power(long x, long y, long MOD) {
        if (y == 0) return 1;
        if (y % 2 == 0)
            return power((x * x) % MOD, y / 2, MOD) % MOD;
        else
            return (x * power((x * x) % MOD, (y - 1) / 2, MOD) % MOD) % MOD;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            if (a == b) {
                System.out.println("0 0");
            } else {
                long diff = Math.abs(a - b);
                long rem = Math.min(a % diff, diff - a % diff);
                System.out.println(diff + " " + rem);
            }
        }
 
        sc.close();
    }
}