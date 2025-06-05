import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            String s = sc.next();  // Input string of 4 digits
            int y = 1000 * (s.charAt(0) - '0') + 100 * (s.charAt(1) - '0') +
                    10 * (s.charAt(2) - '0') + (s.charAt(3) - '0');
 
            int a = -1;
            for (int p = 0; p * p <= y; p++) {
                if (p * p == y) {
                    a = p;
                    break;
                }
            }
 
            System.out.print(a);
            if (a >= 0) {
                System.out.print(" 0");
            }
            System.out.println();
        }
 
        sc.close();
    }
}