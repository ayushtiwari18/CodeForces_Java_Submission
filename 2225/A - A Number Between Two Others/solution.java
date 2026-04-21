import java.util.Scanner;
 
public class A_A_Number_Between_Two_Others {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
 
            if (y == 2 * x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
 
        sc.close();
    }
}