import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double n = sc.nextDouble();
        double ans;
        ans = Math.pow(i, n);
        System.out.println(ans);
        sc.close();
    }
}
