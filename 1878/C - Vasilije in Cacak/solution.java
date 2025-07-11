import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
 
            // Minimum possible sum with k distinct smallest numbers
            long sum1 = (k * (k + 1)) / 2;
 
            // Total sum of first n numbers
            long total = (n * (n + 1)) / 2;
 
            // Maximum possible sum with k distinct largest numbers
            long tmp = n - k;
            long sum2 = total - (tmp * (tmp + 1)) / 2;
 
            if (x >= sum1 && x <= sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}