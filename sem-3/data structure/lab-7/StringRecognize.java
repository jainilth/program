import java.util.*;
class Stack2{
    String s;
    char a[];
    int top;
    Stack2(String s){
        this.s=s;
        a=new char[s.length()];
        top=-1;
    }
    void push(char x){
        if(top>=a.length){
            System.out.println("Stack is full");
        }
        else{
            top++;
            a[top]=x;
        }
    }
    char pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return 0;
        }
            top--;
            return a[top+1];
    }
    void recognizeString(){
        push('c');
        int i=0;
        char c=s.charAt(i);
        while (c!='c') {
            if (c==' ') {
                System.out.println("invalid string");
                return;
            }
            else{
                push(c);
                i++;
                c=s.charAt(i);
            }
        }
        while(a[top]!='c'){
            i++;
            c=s.charAt(i);
            char x=pop();
            if(c!=x){
                System.out.println("invalid string2");
                return;
            }
        }
        System.out.println("valid");
        return;
    }
}
public class StringRecognize{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter string");
        String s=sc.next();
        Stack2 s2=new Stack2(s);
        s2.recognizeString();
    }
}