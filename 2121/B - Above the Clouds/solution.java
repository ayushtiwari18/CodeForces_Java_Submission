import java.util.*;
 
public class B_Above_the_Clouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ok = false;
 
            // Try all possible positions of b (must be in middle)
            for (int i = 1; i < n - 1; i++) {
                String b = s.substring(i, i + 1);
                String aPlusC = s.substring(0, i) + s.substring(i + 1);
                if (aPlusC.contains(b)) {
                    ok = true;
                    break;
                }
            }
 
            System.out.println(ok ? "Yes" : "No");
        }
 
        sc.close();
    }
}