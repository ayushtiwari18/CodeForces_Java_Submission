import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
            }
 
            if (isAllZero(a)) {
                System.out.println(0);
            } else {
                int l = 0, r = n - 1;
 
                // Trim leading zeros
                while (l < n && a[l] == 0) ++l;
                // Trim trailing zeros
                while (r >= 0 && a[r] == 0) --r;
 
                boolean hasZeroInside = false;
                for (int i = l; i <= r; ++i) {
                    if (a[i] == 0) {
                        hasZeroInside = true;
                        break;
                    }
                }
 
                if (hasZeroInside) System.out.println(2);
                else System.out.println(1);
            }
        }
 
        sc.close();
    }
 
    static boolean isAllZero(int[] arr) {
        for (int x : arr) {
            if (x != 0) return false;
        }
        return true;
    }
}