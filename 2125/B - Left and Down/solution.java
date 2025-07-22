import java.util.*;
import java.io.*;
 
public class B_Left_and_Down {
    public static long gcd(long x, long y) {
        while (y != 0) {
            long t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);
            long k = Long.parseLong(input[2]);
 
            long g = gcd(a, b);
 
            long ceilA = (a + k - 1) / k;
            long ceilB = (b + k - 1) / k;
            long mx = Math.max(ceilA, ceilB);
 
            if (g >= mx) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}