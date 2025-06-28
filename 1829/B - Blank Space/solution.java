import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            int maxZeros = 0;
            int currentCount = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    currentCount++;
                    maxZeros = Math.max(maxZeros, currentCount);
                } else {
                    currentCount = 0;
                }
            }
 
            System.out.println(maxZeros);
        }
 
        sc.close();
    }
}