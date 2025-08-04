import java.util.Scanner;
 
public class Main {
 
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        // Compute bitwise AND
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans &= arr[i];
        }
 
        // Output the result
        System.out.println(ans);
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