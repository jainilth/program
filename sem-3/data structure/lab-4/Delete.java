// import java.util.Scanner;

// public class Delete {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Array without duplicates: ");
//         for (int i = 0; i < size; i++) {
//             boolean isDuplicate = false;
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     isDuplicate = true;
//                     break;
//                 }
//             }
//             if (!isDuplicate) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//         sc.close();
//     }
// }
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array without duplicates: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}