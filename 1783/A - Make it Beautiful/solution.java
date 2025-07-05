import java.util.*;
 
public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        
        swap(arr, 0, 1);
        swap(arr, 0, n - 1);
 
        if (arr[0] == arr[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
 
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
    }
}