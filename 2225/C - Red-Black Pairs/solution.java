import java.util.Scanner;
 
public class C_Red_Black_Pairs {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        while (T-- > 0) {
 
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
 
            int ans = 0;
            int i = 0;
 
            while (i < n) {
 
                char top = s1.charAt(i);
                char bottom = s2.charAt(i);
 
                if (top == bottom) {
                    i++;
                }
 
                else if (i + 1 < n &&
                        s1.charAt(i + 1) != s2.charAt(i + 1) &&
                        top == s1.charAt(i + 1) &&
                        bottom == s2.charAt(i + 1)) {
 
                    i += 2;
                }
 
                else {
                    ans++;
                    i++;
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}