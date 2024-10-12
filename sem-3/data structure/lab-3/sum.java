import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        for (int i = m; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
        sc.close();
    }
}
