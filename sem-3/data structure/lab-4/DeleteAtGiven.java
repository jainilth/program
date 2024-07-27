import java.util.*;

public class DeleteAtGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 5, 3, 6, 8, 2, 10 };
        int n = arr.length;
        int[] arr2 = new int[n - 1];
        System.out.println("plese etner index which you want to delete");
        int index = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if (i >= index) {
                arr2[i] = arr[i + 1];
            } else {
                arr2[i] = arr[i];
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
