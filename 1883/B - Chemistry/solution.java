import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        final int B = 26;
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
 
            int[] freq = new int[B];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
 
            int oddCount = 0;
            for (int i = 0; i < B; i++) {
                if (freq[i] % 2 != 0) {
                    oddCount++;
                }
            }
 
            System.out.println(oddCount <= k + 1 ? "YES" : "NO");
        }
 
        sc.close();
    }
}