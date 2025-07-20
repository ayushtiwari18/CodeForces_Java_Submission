import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = sc.next();
 
            long cnt = 1, cur = 1;
 
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cur++;
                } else {
                    cur = 1;
                }
                cnt = Math.max(cnt, cur);
            }
 
            System.out.println(cnt + 1);
        }
        sc.close();
    }
}