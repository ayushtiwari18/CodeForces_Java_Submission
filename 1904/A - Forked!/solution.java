import java.util.*;
 
public class Main {
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
 
    static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
 
        Set<String> st1 = new HashSet<>();
        Set<String> st2 = new HashSet<>();
 
        for (int j = 0; j < 4; j++) {
            st1.add((x1 + dx[j] * a) + "," + (y1 + dy[j] * b));
            st2.add((x2 + dx[j] * a) + "," + (y2 + dy[j] * b));
            st1.add((x1 + dx[j] * b) + "," + (y1 + dy[j] * a));
            st2.add((x2 + dx[j] * b) + "," + (y2 + dy[j] * a));
        }
 
        int ans = 0;
        for (String point : st1) {
            if (st2.contains(point)) {
                ans++;
            }
        }
 
        System.out.println(ans);
    }
}