import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        long t = scanner.nextLong(); // number of test cases
        while (t-- > 0) {
            long n = scanner.nextLong();
            long pos = 0, neg = 0;
 
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x > 0) {
                    pos++;
                } else if (x < 0) {
                    neg++;
                }
            }
 
            long move = 0;
            if (pos < neg) {
                move = (neg - pos + 1) / 2;
                pos += move;
                neg -= move;
            }
 
            if (neg % 2 != 0) {
                move++;
            }
 
            System.out.println(move);
        }
 
        scanner.close();
    }
}