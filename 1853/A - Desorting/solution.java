import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean sorted = true;
            long minnum = (long) 1e9 + 7;
 
            long prev = sc.nextLong();
            for (int i = 1; i < n; i++) {
                long x = sc.nextLong();
                if (prev <= x) {
                    long num = 1 + (x - prev) / 2;
                    minnum = Math.min(minnum, num);
                } else {
                    sorted = false;
                }
                prev = x;
            }
 
            System.out.println(sorted ? minnum : 0);
        }
 
        sc.close();
    }
}