import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            long x = sc.nextLong();  // Initial position
            long n = sc.nextLong();  // Number of jumps
 
            long rem = n % 4;
 
            if (x % 2 == 0) {
                if (rem == 0) {
                    System.out.println(x);
                } else if (rem == 1) {
                    System.out.println(x - n);
                } else if (rem == 2) {
                    System.out.println(x + 1);
                } else { // rem == 3
                    System.out.println(x + n + 1);
                }
            } else { // x is odd
                if (rem == 0) {
                    System.out.println(x);
                } else if (rem == 1) {
                    System.out.println(x + n);
                } else if (rem == 2) {
                    System.out.println(x - 1);
                } else { // rem == 3
                    System.out.println(x - (n + 1));
                }
            }
        }
 
        sc.close();
    }
}