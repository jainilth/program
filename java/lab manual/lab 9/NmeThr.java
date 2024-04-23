import java.util.*;
public class NmeThr {
    public static void main(String[] args) {
        Move m= new Move(5,1000);
        Move n=new Move(10,500);
        m.start();
        n.start();
    }
}
class Move extends Thread{
    int j;
    int s;
    Move(int n,int sleep){
        j=n;
        s=sleep;
    }
    public void run(){
        try{
            for(int i=0;i<j;i++){
                System.out.println(i);
                sleep(s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
