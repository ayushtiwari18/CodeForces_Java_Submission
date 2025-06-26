import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        long N = sc.nextLong();
        long K = sc.nextLong();
 
        if (N % K != 0) {
            System.out.println(1);
            System.out.println(N);
        } else {
            System.out.println(2);
            System.out.println((N - 1) + " " + 1);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            solve(sc);
        }
    }
}