import java.util.*;
 
public class A_Only_One_Digit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
 
        while (t-- > 0) {
            int x = scanner.nextInt();
            Set<Character> digitsInX = new HashSet<>();
 
  
            for (char c : String.valueOf(x).toCharArray()) {
                digitsInX.add(c);
            }
 
            int result = -1;
            for (int i = 0; i <= 9; i++) {
                if (digitsInX.contains((char)(i + '0'))) {
                    result = i;
                    break;
                }
            }
 
            System.out.println(result);
        }
 
        scanner.close();
    }
}