import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter a number:");
        int a = sc.nextInt();
        System.out.println("plese enter b number:");
        int b = sc.nextInt();
        System.out.println("plese enter c number:");
        int c = sc.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("plese enter different number");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a is largest");
                } else {
                    System.out.println("c is largest");
                }
            } else {
                if (b > c) {
                    System.out.println("b is largest");
                } else {
                    System.out.println("c is largest");
                }
            }
        }
        sc.close();
    }
}
