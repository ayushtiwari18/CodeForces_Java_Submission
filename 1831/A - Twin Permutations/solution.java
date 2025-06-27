import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        
        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            System.out.print((n + 1 - temp) + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        
        while (T-- > 0) {
            solve(sc);
        }
    }
}