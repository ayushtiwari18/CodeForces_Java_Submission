import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            long n = sc.nextLong();
 
            if (n % 2 == 1 || n < 4) {
                System.out.println(-1);
            } else {
                long mn = n / 6;
                if (n % 6 != 0) mn++; // ceiling(n/6)
                
                long mx = n / 4;
 
                System.out.println(mn + " " + mx);
            }
        }
    }
}