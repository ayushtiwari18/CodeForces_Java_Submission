import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int minOper = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                minOper = 0;
                break;
            }
            minOper = Math.min(minOper, Math.abs(t));
        }
 
        System.out.println(minOper);
    }
}