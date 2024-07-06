import java.util.*;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int max=size;
        int[] array = new int[size];
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
            array[i] = num;
            used[num] = true;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            b[i]=a[array[i]];
            System.out.print(b[i]+" ");
        }
    }
}
