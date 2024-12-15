import java.util.*;
public class store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre-compute frequencies using a HashMap
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("-------------------------------");
        // Print frequencies
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
                System.out.println("-------------------------------");
        // Input number of queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch and print frequency of the queried number
            System.out.println(mpp.getOrDefault(number, 0));
        }

        sc.close();
    }
}
