import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            boolean res = (a == n && b == n) || (a + b + 1 < n);
 
            System.out.println(res ? "Yes" : "No");
        }
 
        sc.close();
    }
}