import java.util.*;
class Stack3{
    char a[];
    int top;
    int maxSize;
    Stack3(int n){
        maxSize=n;
        a=new char[maxSize];
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
}
public class AB {
    public static void main(String[] args) {
        
    }
}
