import java.util.*;
 
public class B_Line_Segments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int px = sc.nextInt(), py = sc.nextInt();
            int qx = sc.nextInt(), qy = sc.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            double dx = px - qx;
            double dy = py - qy;
            double dist = Math.sqrt(dx * dx + dy * dy);
            
            
            long minDist = 0;
            long maxDist = 0;
            
            for (int i = 0; i < n; i++) {
                long newMaxDist = maxDist + a[i];
                long newMinDist;
                
                if (a[i] >= maxDist) {
                    newMinDist = a[i] - maxDist;
                } else if (a[i] <= minDist) {
                    newMinDist = minDist - a[i];
                } else {
                    newMinDist = 0;
                }
                
                minDist = newMinDist;
                maxDist = newMaxDist;
            }
            
            if (dist >= minDist && dist <= maxDist) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}