import java.util.*;

class Stack3 {
    char a[];
    int top;
    int maxSize;

    Stack3(int n) {
        maxSize = n;
        a = new char[maxSize];
        top = -1;
    }

    void push(char x) {
        if (top >= a.length) {
            System.out.println("Stack is full");
        } else {
            top++;
            a[top] = x;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        }
        top--;
        return a[top + 1];
    }
}

public class AB {
    public static void main(String[] args) {
        Stack3 s1 = new Stack3(20);
        Stack3 s2 = new Stack3(20);
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter a string");
        String s = sc.next();
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 != 0) {
                System.out.println("invalid String");
                return;
            }
            if (s.charAt(i) != 'a' && s.charAt(i) != 'b') {
                System.out.println("invalid");
                return;
            }
            if (s.charAt(i) == 'a') {
                s1.push(s.charAt(i));
            }
            if (s.charAt(i) == 'b') {
                s2.push(s.charAt(i));
            }
        }
        int i = 0, j = 0;
        while (s1.top != -1) {
            char x = s1.pop();
            char y = s2.pop();
            i++;
            j++;
        }
        if (i == j) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
