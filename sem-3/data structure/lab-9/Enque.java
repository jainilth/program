import java.util.*;
class Queue{
    int a[];
    int n;
    int f=0;
    int r=0;
    Queue(int n){
        this.n = n;
        a = new int[n];
    }
    void enqueue(int x){
        if(r>=n){
            System.out.println("Queue is full");
            return;
        }
        else{
            r++;
            a[r]=x;
            if(f==0){
                f=1;
            }
            return;
        }
    }
    int dequeue(){
        if(f==0){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            int y=a[f];
            System.out.println(y);
            if(f==r){
                f=0;
                r=0;
            }
            else{
                f++;
            }
            return y;
        }
    }
    void display(){
        for(int i=f;i<=r;i++){
            System.out.print(a[i]+" ");
        }
    }
}
public class Enque {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(2);
        q.enqueue(10);
        q.display();
        System.out.println("");
        q.dequeue();
        q.display();
    }
}