import java.util.*;

class Stacky {
    String s;
    char a[];
    int top;

    Stacky(String s) {
        this.s = s;
        a = new char[100];
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

    int f(char x) {
        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 3;
        } else if (x == '^') {
            return 6;
        } else if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            return 7;
        } else if (x == '(') {
            return 9;
        } else if (x == ')') {
            return 0;
        } else {
            return -1; 
        }
    }
    int g(char x) {
        if (x == '+' || x == '-') {
            return 2;
        } else if (x == '*' || x == '/') {
            return 4;
        } else if (x == '^') {
            return 5;
        } else if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            return 8;
        } else if (x == '(') {
            return 0;
        } else {
            return -1; 
        }
    }

    int r(char x) {
        if (x == '+' || x == '-' || x == '*' || x == '/' || x == '^') {
            return -1;
        } else if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            return 1;
        } else {
            return -1; 
        }
    }

    // String convert() {
    //     push('(');
    //     StringBuilder polish=new StringBuilder();
    //     int rank = 0;
    //     int k = 0;
    //     char n = s.charAt(k);
    //     while (k < s.length()) {
    //         if (top < 0) {
    //             return "invalid1";
    //         }
    //         while (g(a[top]) > f(n)) {
    //             char temp=pop();
    //             polish.append(temp);
    //             System.out.println(polish.toString());
    //             rank += r(temp);
    //             System.out.println(rank);
    //             if (rank < 1) {
    //                 return "invalid2";
    //             }
    //         }
    //         if (g(a[top]) != f(n)) {
    //             push(n);
    //         } else {
    //             pop();
    //         }
    //         k++;
    //     }
    //     if ( rank != 1) {
    //         return "invalid3";
    //     }
    //     return polish.toString();
    // }
    String convert() {
        push('(');
        StringBuilder polish = new StringBuilder();
        s += ')'; 
        int k = 0;
        char n;

        while (k < s.length()) {
            n = s.charAt(k);
            if (n == ' ') {
                k++;
                continue;
            }
            if (n == '(') {
                push(n);
            } 
            else if (n == ')') {
                while (a[top] != '(') {
                    polish.append(pop());
                }
                pop(); 
            } 
            else if (g(n) > 0) { 
                while (g(a[top]) > f(n)) {
                    polish.append(pop());
                }
                push(n);
            } 
            else if ((n >= 'A' && n <= 'Z') || (n >= 'a' && n <= 'z')) {
                polish.append(n);
            } 
            else {
                return "Invalid character: " + n; 
            }
            k++;
        }
        return polish.toString();
    }
}

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter string");
        String s = sc.next();
        Stacky s1 = new Stacky(s);
        String ans=s1.convert(); 
        System.out.println(ans);
        sc.close();
    }
}
