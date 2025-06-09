import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong();  // Read number of test cases
 
        while (t-- > 0) {
            long n = sc.nextLong();  // Read number of elements
            long x = sc.nextLong();  // Read the first element
 
            boolean ans = (x == 1);  // Check if first element is 1
 
            // Read and discard the remaining (n - 1) elements
            for (long i = 1; i < n; i++) {
                sc.nextLong();
            }
 
            // Print result based on the first element
            System.out.println(ans ? "YES" : "NO");
        }
 
        sc.close();
    }
}