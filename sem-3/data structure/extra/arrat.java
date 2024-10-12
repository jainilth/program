import java.util.*;

public class arrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        // int a[] = new int[n];
        // for (int i=0; i<n; i++) {
        // a[i] = sc.nextInt();
        // }
        // int c[] = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (int) (Math.random() * (max - 1));
            boolean a = true;
            for (int j = 0; j < n; j++) {
                if (b[i] == b[j]) {
                    while (a) {
                        b[i] = (int) (Math.random() * (max - 1));
                        if (b[i] != b[j]) {
                            a = false;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

        sc.close();
    }
}
// int[] array = new int[count];
// Random random = new Random();
// boolean exists;
// int num;
// for (int i = 0; i < count; i++) {
// do {
// num = random.nextInt(max - min + 1) + min;
// exists = false;
// for (int j = 0; j < i; j++) {
// if (array[j] == num) {
// exists = true;
// break;
// }
// }
// } while (exists);
// array[i] = num;
// }