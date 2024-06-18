import java.util.*;

public class Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int large = a[0];
        int small = a[0];
        int pl = 0, ps = 0;
        for (int i = 1; i < n; i++) {
            if (large < a[i]) {
                large = a[i];
                pl = i;
            } else if (small > a[i]) {
                small = a[i];
                ps = i;
            }
        }
        System.out.println(pl);
        System.out.println(ps);
    }
}