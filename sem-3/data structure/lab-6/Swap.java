import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        SwapNum s=new SwapNum(a,b);
        s.printS();
        sc.close();
    }
}
class SwapNum{
    int a;
    int b;
    SwapNum(int a,int b){
        this.a=a;
        this.b=b;
    }
    void printS(){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
