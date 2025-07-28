import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
 
        int minCount = 0;
 
        for (int i = n - 2; i >= 0; i--) {
            while (arr[i] >= arr[i + 1] && arr[i] > 0) {
                arr[i] /= 2;
                minCount++;
            }
 
            if (arr[i] == arr[i + 1]) {
                System.out.println(-1);
                return;
            }
        }
 
        System.out.println(minCount);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            solve(sc);
        }
 
        sc.close();
    }
}