import java.util.*;

class Stacky {
    String s;
    char a[];
    int top;

    Stack2(String s){
        this.s=s;
        a=new char[s.length()];
        top=-1;
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

public class InfixToPostfix {
    public static void main(String[] args) {
        
    }
}
