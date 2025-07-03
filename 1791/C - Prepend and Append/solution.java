import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the string
            String s = sc.next(); // Input string
 
            int left = 0;
            int right = s.length() - 1;
 
            while (left < right && s.charAt(left) != s.charAt(right)) {
                left++;
                right--;
            }
 
            System.out.println(right - left + 1);
        }
 
        sc.close();
    }
}