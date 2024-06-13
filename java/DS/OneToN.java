import java.util.*;
public class OneToN {
    public static void main(String[] args) {
        System.out.println("plese enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        increse(a);
    }
    public static void increse(int a){
        if(a==0){
            return;
        }
        increse(a-1);
        System.out.print(a+" ");
        return;
    }
}
