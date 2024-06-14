import java.util.*;
public class recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fac(n);
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
}
