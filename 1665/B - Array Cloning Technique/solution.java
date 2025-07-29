import java.util.*;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            TreeMap<Integer, Integer> freq = new TreeMap<>();
            int maxFreq = Integer.MIN_VALUE;
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(arr[i]));
            }
 
            if (maxFreq == n) {
                System.out.println(0);
                continue;
            }
 
            int remaining = n - maxFreq;
            int operations = 0;
            int current = maxFreq;
 
            while (remaining > 0) {
                operations++; // duplication operation
                int toCopy = Math.min(remaining, current);
                operations += toCopy;
                remaining -= toCopy;
                current *= 2;
            }
 
            System.out.println(operations);
        }
 
        sc.close();
    }
}