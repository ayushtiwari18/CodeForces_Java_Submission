import java.util.*;
 
public class B_No_Casino_in_the_Mountains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt(); 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt(); 
            }
 
            int count = 0; 
            int i = 0;
 
            while (i <= n - k) {
                boolean canHike = true;
 
               
                for (int j = 0; j < k; j++) {
                    if (a[i + j] == 1) {
                        canHike = false;
                        break;
                    }
                }
 
                if (canHike) {
                    count++;
                    i += k + 1; 
                } else {
                    i++; 
                }
            }
 
            System.out.println(count);
        }
 
        scanner.close();
    }
}