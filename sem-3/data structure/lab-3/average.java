import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        ans = ans / n;
        System.out.println(ans);
    }
}
