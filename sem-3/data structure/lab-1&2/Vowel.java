import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        c = Character.toUpperCase(c);
        if (c == 'A' || c == 'E' | c == 'I' || c == 'O' || c == 'U') {
            System.out.println("vowel");
        } else {
            System.out.println("not");
        }
        sc.close();
    }
}
