import java.util.*;

public class Binery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 4, 6, 7, 10, 13, 24, 78};
        System.out.println("Enter the number to search:");
        int n = sc.nextInt();
        int min = 0;
        int max = a.length - 1;
        boolean t = false;

        while (min <= max) {
            int mid = (max + min) / 2;
            if (a[mid] > n) {
                max = mid - 1;
            } else if (a[mid] == n) {
                System.out.println("The number is available at " + (mid + 1) + " position");
                t = true;
                break;
            } else {
                min = mid + 1;
            }
        }

        if (!t) {
            System.out.println("Element is not present");
        }

        sc.close();
    }
}



