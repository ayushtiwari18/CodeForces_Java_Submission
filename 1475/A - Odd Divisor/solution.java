import java.util.Scanner;
 
public class Main {
 
    static void solve(long n) {
        if (n % 2 != 0) {
            System.out.println("YES");
            return;
        }
 
        while (n % 2 == 0) {
            n /= 2;
        }
 
        if (n > 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            solve(n);
        }
 
        sc.close();
    }
}