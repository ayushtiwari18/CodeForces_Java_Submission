import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        final int B = 10;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
 
        while (t-- > 0) {
            String[] m = new String[B];
            for (int i = 0; i < B; i++) {
                m[i] = sc.nextLine();
            }
 
            int total = 0;
            for (int row = 0; row < B; row++) {
                for (int col = 0; col < B; col++) {
                    if (m[row].charAt(col) == '.') {
                        continue;
                    }
                    int xrow = Math.min(row, B - 1 - row);
                    int xcol = Math.min(col, B - 1 - col);
                    int score = 1 + Math.min(xrow, xcol);
                    total += score;
                }
            }
 
            System.out.println(total);
        }
    }
}