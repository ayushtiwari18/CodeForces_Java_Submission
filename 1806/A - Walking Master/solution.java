import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
 
        if (b > d) {
            System.out.println(-1);
        } else {
            if ((a + d - b) < c) {
                System.out.println(-1);
            } else {
                System.out.println(2 * (d - b) + (a - c));
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
 
        while (t-- > 0) {
            solve(sc);
        }
 
        sc.close();
    }
}