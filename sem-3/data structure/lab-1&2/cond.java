import java.util.*;

public class cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = 0, m = 0, y = 0;
        while (a > 0) {
            if (a >= 365) {
                y++;
                a = a - 365;
            } else if (a > 7) {
                m++;
                a = a - 7;
            } else {
                d = a;
                a = 0;
            }
        }
        System.out.println(y + ":" + m + ":" + d);
        sc.close();
    }
}
