import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter radious");
        int a = sc.nextInt();
        double ans;
        ans = Math.PI * a * a;
        System.out.println(ans);
        sc.close();
    }
}
