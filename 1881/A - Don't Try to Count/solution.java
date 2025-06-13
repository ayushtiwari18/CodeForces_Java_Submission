import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
 
            int operations = 0;
            StringBuilder current = new StringBuilder(x);
 
            // Limit how far we grow the string to avoid infinite loop
            int maxLength = 300; // safe upper bound given constraint n*m <= 25
 
            while (current.indexOf(s) == -1) {
                current.append(current.toString());
                operations++;
 
                if (current.length() > maxLength) {
                    operations = -1;
                    break;
                }
            }
 
            System.out.println(operations);
        }
 
        sc.close();
    }
}