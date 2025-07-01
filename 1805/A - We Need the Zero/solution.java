import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int xOR = 0;
        for (int i = 0; i < n; i++) {
            xOR ^= arr[i];
        }
 
        if (xOR == 0) {
            System.out.println(0);
        } else if ((n & 1) == 1) { // if n is odd
            System.out.println(xOR);
        } else {
            System.out.println(-1);
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}