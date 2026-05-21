import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class AConstructAnArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            for (int i = 1; i <= n; i++) {
                sb.append(2 * i - 1).append(" ");
            }
 
            sb.append("
");
        }
 
        System.out.print(sb);
    }
}