import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if ((n / i) != i) {
                    System.out.println(n / i);
                }
            }
        }
        sc.close();
    }
}
