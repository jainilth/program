import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter a sentence");
        String s1 = sc.next();
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("plese enter a number");
        int n = sc.nextInt();
        int number=n;
        int b = 0;
        while (n > 0) {
            b = (b * 10) + (n % 10);
            n = n / 10;
        }
        if (number == b) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
        if (s1.equals(s2)) {
            System.out.println("the string is palindrome");
        } else {
            System.out.println("the string is not palindrome");
        }
        sc.close();
    }
}
