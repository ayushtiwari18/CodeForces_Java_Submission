import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
 
            if (mp.size() >= 3) {
                System.out.println("NO");
            } else if (mp.size() == 1) {
                System.out.println("YES");
            } else {
                // mp.size() == 2
                Iterator<Integer> it = mp.values().iterator();
                int a = it.next();
                int b = it.next();
                System.out.println(Math.abs(a - b) >= 2 ? "NO" : "YES");
            }
        }
        sc.close();
    }
}