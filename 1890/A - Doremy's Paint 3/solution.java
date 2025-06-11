import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();  // size of array
            Map<Integer, Integer> map = new HashMap<>();
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
 
            if (map.size() >= 3) {
                System.out.println("NO");
            } else if (map.size() == 1) {
                System.out.println("YES");
            } else {
                List<Integer> values = new ArrayList<>(map.values());
                if (Math.abs(values.get(0) - values.get(1)) >= 2) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
 
        sc.close();
    }
}