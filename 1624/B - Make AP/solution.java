import java.util.Scanner;
 
public class Main {
    public static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
 
        // Check if it's already in arithmetic progression
        if ((b - a) == (c - b)) {
            System.out.println("YES");
        }
 
        // Check if we can change a to make AP
        else if ((2 * b - c) % a == 0 && (2 * b - c) > 0) {
            System.out.println("YES");
        }
 
        // Check if we can change b to make AP
        else if ((a + c) % (2 * b) == 0) {
            System.out.println("YES");
        }
 
        // Check if we can change c to make AP
        else if ((2 * b - a) % c == 0 && (2 * b - a) > 0) {
            System.out.println("YES");
        }
 
        else {
            System.out.println("NO");
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            solve(sc);
        }
    }
}