import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '.') {
                    int cnt = 0;
                    while (i < n && str.charAt(i) == '.') {
                        cnt++;
                        i++;
                    }
                    if (cnt > 2) {
                        ans = 2;
                        break;
                    } else {
                        ans += cnt;
                    }
                    i--; // Adjust for outer loop increment
                }
            }
            System.out.println(ans);
        }
    }
}