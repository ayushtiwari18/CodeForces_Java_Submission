import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong(); // number of test cases
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
 
            boolean res = (n % 2 == 0) || ((n - k) % 2 == 0);
            System.out.println(res ? "YES" : "NO");
        }
 
        sc.close();
    }
}