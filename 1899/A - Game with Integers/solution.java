import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        long t = scanner.nextLong(); // Read number of test cases
 
        while (t-- > 0) {
            long x = scanner.nextLong(); // Read the value of x
 
            if (x % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }
 
        scanner.close();
    }
}