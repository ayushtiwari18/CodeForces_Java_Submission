import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
 
            long ans = b;
 
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                ans += Math.min(a - 1, x);
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}