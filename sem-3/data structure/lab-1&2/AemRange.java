import java.util.*;

public class AemRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            int n = i;
            int b = n;
            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }
            n = b;
            int ans = 0;
            while (n > 0) {
                int c = n % 10;
                ans += Math.pow(c, count);
                n /= 10;
            }
            if (ans == b) {
                System.out.println(ans + " ");
            }
        }
        sc.close();
    }
}
