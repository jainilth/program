import java.util.*;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i == c) {
                d[i] = b;
            } else if (i < c) {
                d[i] = a[i];
            } else if (i > c) {
                d[i] = a[i - 1];
            }
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(d[i] + " ");
        }
        sc.close();
    }
}
