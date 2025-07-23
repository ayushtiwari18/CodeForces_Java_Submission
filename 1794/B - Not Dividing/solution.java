import java.util.*;
 
public class Main {
 
    public static void lakshya(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        // Input and first transformation: If arr[i] == 1, increment it
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1)
                arr[i]++;
        }
 
        // Second transformation: If next element divisible by current, increment next
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] % arr[i] == 0)
                arr[i + 1]++;
        }
 
        // Output result
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            lakshya(sc);
        }
 
        sc.close();
    }
}