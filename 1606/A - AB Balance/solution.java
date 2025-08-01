import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();  // Read number of test cases
        sc.nextLine();  // Consume the newline
 
        while (t-- > 0) {
            String s = sc.nextLine();
 
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                // Replace first character with last character
                s = s.charAt(s.length() - 1) + s.substring(1);
            }
 
            System.out.println(s);
        }
 
        sc.close();
    }
}