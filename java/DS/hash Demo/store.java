import java.util.*;
public class store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //put(key,value):-
            //key-the element of array
            //value-getorDefault()->return increment of index or if available otherwise set 0 of given element
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("-------------------------------");
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
                System.out.println("-------------------------------");
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number, 0));
        }

        sc.close();
    }
}
