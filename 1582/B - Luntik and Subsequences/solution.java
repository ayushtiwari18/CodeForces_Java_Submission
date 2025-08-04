import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // number of elements
            int c1 = 0, c2 = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    c1++;
                } else if (x == 1) {
                    c2++;
                }
            }
 
            // result = (2^c1) * c2
            long result = (1L << c1) * c2;
            System.out.println(result);
        }
 
        sc.close();
    }
}