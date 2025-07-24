import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of array
            int[] arr = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            int maxDiff = 0;
 
            // Case 1: arr[n - 1] - arr[i] for i = 0 to n - 2
            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, arr[n - 1] - arr[i]);
            }
 
            // Case 2: arr[i + 1] - arr[0] for i = 0 to n - 2
            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, arr[i + 1] - arr[0]);
            }
 
            // Case 3: arr[i] - arr[i + 1] for i = 0 to n - 2
            for (int i = 0; i < n - 1; i++) {
                maxDiff = Math.max(maxDiff, arr[i] - arr[i + 1]);
            }
 
            System.out.println(maxDiff);
        }
 
        sc.close();
    }
}