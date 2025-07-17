import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long cnt = 1;
 
            for (long p = 2; p <= n && n % p == 0; p++) {
                cnt++;
            }
 
            System.out.println(cnt);
        }
 
        sc.close();
    }
}