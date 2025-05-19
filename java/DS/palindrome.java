import java.util.*;

public class palindrome {
    // another approch
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int last = s.length() - 1;
        int start = 0;
        while (start <= last) {
            char cf = a.charAt(start);
            char cl = a.charAt(last);
            if (!Character.isLetterOrDigit(cf)) {
                start++;
            } else if (!Character.isLetterOrDigit(cl)) {
                last--;
            } else {
                if (cf != cl)
                    return false;

                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.toLowerCase();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                s2 += s.charAt(i);
            }
        }
        String s3 = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            s3 += s2.charAt(i);
        }
        if (s2.equals(s3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
