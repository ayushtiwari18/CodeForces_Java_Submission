import java.util.*;
 
public class Main {
 
    public static int solve(List<Integer> a, int x) {
        int n = a.size();
        // Compute max distance: from start to first station, between stations, and double of last station to end
        int maxDist = Math.max(a.get(0), 2 * (x - a.get(n - 1)));
 
        for (int i = 1; i < n; i++) {
            maxDist = Math.max(maxDist, a.get(i) - a.get(i - 1));
        }
 
        return maxDist;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
 
        for (int zz = 0; zz < t; zz++) {
            int n = sc.nextInt(); // number of gas stations
            int x = sc.nextInt(); // length of the road
 
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
 
            Collections.sort(a); // sort the gas stations like in C++
            int result = solve(a, x);
            System.out.println(result);
        }
 
        sc.close();
    }
}