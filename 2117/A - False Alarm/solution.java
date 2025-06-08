import java.util.*;
 
public class FalseAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] doors = new int[n];
            for (int i = 0; i < n; i++) {
                doors[i] = sc.nextInt();
            }
 
            boolean buttonUsed = false;
            int buttonEndsAt = -1;
            boolean canPass = true;
 
            for (int time = 0; time < n; time++) {
                if (doors[time] == 0) {
                    // Door is open, pass normally
                    continue;
                } else {
                    // Door is closed
                    if (!buttonUsed) {
                        buttonUsed = true;
                        buttonEndsAt = time + x - 1;
                    } else {
                        // Check if button effect is still active
                        if (time > buttonEndsAt) {
                            canPass = false;
                            break;
                        }
                    }
                }
            }
 
            System.out.println(canPass ? "YES" : "NO");
        }
 
        sc.close();
    }
}