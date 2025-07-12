import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
 
            long sum1 = (k * (k + 1)) / 2; // smallest k distinct numbers: 1+2+...+k
            long total = (n * (n + 1)) / 2;
            long tmp = n - k;
            long sum2 = total - (tmp * (tmp + 1)) / 2; // largest k distinct numbers: n+(n-1)+...+(n-k+1)
 
            if (x >= sum1 && x <= sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}