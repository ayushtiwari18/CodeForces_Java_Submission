import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong(); // Read number of test cases
        while (t-- > 0) {
            long n = sc.nextLong(); // Read number of elements
            for (long i = 0; i < n; i++) {
                long x = sc.nextLong(); // Read each element (unused)
            }
 
            if (n % 2 == 1) {
                // If n is odd
                System.out.println("4");
                System.out.println("2 " + n);
                System.out.println("2 " + n);
                System.out.println("1 2");
                System.out.println("1 2");
            } else {
                // If n is even
                System.out.println("2");
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            }
        }
 
        sc.close();
    }
}