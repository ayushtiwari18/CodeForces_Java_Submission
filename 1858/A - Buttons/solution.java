import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            if (a + (c % 2) > b) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
 
        sc.close();
    }
}