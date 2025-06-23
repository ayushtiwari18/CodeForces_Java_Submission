import java.util.Scanner;
 
public class A_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int aliceToX = Math.abs(a - x);
            int aliceToY = Math.abs(a - y);
            boolean found = false;
            for (int b = 1; b <= 100; b++) {
                if (b == a) continue;
 
                int bobToX = Math.abs(b - x);
                int bobToY = Math.abs(b - y);
 
                if (bobToX < aliceToX && bobToY < aliceToY) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }
 
        sc.close();
    }
}