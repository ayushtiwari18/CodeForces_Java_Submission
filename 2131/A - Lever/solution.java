import java.util.*;
 
public class A_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int iterations = 0;
            
            while (true) {
             
                boolean canDecrease = false;
                for (int i = 0; i < n; i++) {
                    if (a[i] > b[i]) {
                        a[i]--;
                        canDecrease = true;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        a[i]++;
                        break;
                    }
                }
                iterations++;
                
                if (!canDecrease) {
                    break;
                }
            }
            
            System.out.println(iterations);
        }
        sc.close();
    }
}