class Stackx{
    int arr[];
    int top;
    Stackx(int n){
        arr=new int[n];
        top=-1;
    }
    void push(int x){
        if(top>=arr.length){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top]=x;
            return;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            int a=arr[top+1];
            arr[top+1]=0;
        }
    }
    void displayStack(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    void peep(int i){
        if(top-i+1<0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top-i+1]);
            arr[top-i+1]=0;
        }
    }
    void change(int i,int x){
        if(top-i+1<0){
            System.out.println("Stack is empty");
        }
        else{
            arr[top-i+1]=x;
        }
    }
}
public class StackDemo{
    public static void main(String[] args) {
        Stackx s=new Stackx(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.displayStack();
        s.peep(3);
        s.displayStack();
        s.change(3,5);
        s.displayStack();
    }
}