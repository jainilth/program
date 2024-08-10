import java.util.*;

public class Cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int th = 0;
        int tm = 0;
        int ts = 0;
        while (n > 0) {
            if (n >= 3600) {
                th++;
                n = n - 3600;
            } else if (n >= 60) {
                tm++;
                n = n - 60;
            } else {
                ts = n;
                n = 0;
            }
        }
        System.out.println(th + ":" + tm + ":" + ts);
        sc.close();
    }
}