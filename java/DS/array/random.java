import java.util.*;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int max=size;
        int[] a=new int[size];
        int[] b=new int[size];
        boolean[] used = new boolean[size];
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int num;
            do {
                num = (int) (Math.random() * (max));
            } while (used[num]);
            b[i] = a[num];
            used[num] = true;
        }
        sc.close();
    }
}
