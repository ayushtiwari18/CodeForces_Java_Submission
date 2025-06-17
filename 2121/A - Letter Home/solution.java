import java.util.*;
 
public class A_Letter_Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
 
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of positions
            int s = scanner.nextInt(); // Starting position
 
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
                int pos = scanner.nextInt();
                min = Math.min(min, pos);
                max = Math.max(max, pos);
            }
 
            // Travel from s to nearest endpoint, then across the whole range
            int steps = (max - min) + Math.min(Math.abs(s - min), Math.abs(s - max));
            System.out.println(steps);
        }
 
        scanner.close();
    }
}