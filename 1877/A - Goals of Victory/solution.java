import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = 1;
        if (sc.hasNextInt()) {
            T = sc.nextInt();
        }
 
        while (T-- > 0) {
            solve(sc);
        }
 
        sc.close();
    }
 
    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long sum = 0;
 
        for (int i = 0; i < n - 1; i++) {
            long temp = sc.nextLong();
            sum += temp;
        }
 
        System.out.println(-sum);
    }
}