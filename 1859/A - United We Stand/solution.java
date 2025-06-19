import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Size of array
            int[] a = new int[n];
            int mx = Integer.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mx = Math.max(mx, a[i]);
            }
 
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                if (a[i] < mx) {
                    b.add(a[i]);
                } else {
                    c.add(a[i]);
                }
            }
 
            if (b.size() > 0) {
                System.out.println(b.size() + " " + c.size());
 
                for (int num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();
 
                for (int num : c) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
 
        sc.close();
    }
}