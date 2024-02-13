import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter a");
        int a=sc.nextInt();
        System.out.println("plese enter b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum is="+sum);
        sc.close();
    }
}
