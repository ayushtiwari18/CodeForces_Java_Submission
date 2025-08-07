import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long i = sc.nextLong();
            long j = sc.nextLong();
 
            
            if ((i <= n / 2 && j <= m / 2) || (i >= n / 2 && j >= m / 2)) {
                System.out.println("1 " + m + " " + n + " 1");
            } else {
                System.out.println("1 1 " + n + " " + m);
            }
        }
 
        sc.close();
    }
}