import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 23;
        for (int i = 0; i < n; i++) {
            if (a[i] == c) {
                i--;
                continue;
            }
        }
    }
}