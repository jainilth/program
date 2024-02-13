import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("plese enter your radius");
        double r=sc.nextDouble();
        double pi=Math.PI;
        double ans=pi*r*r;
        System.out.println("your area is"+ans);
        sc.close();
    }
}
