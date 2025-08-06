import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
 
            if (a == b) {
                System.out.println("0 0");
            } else {
                long diff = Math.abs(a - b);
                long minMoves = Math.min(a % diff, diff - (a % diff));
                System.out.println(diff + " " + minMoves);
            }
        }
    }
}