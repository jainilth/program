import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter name");
        String a=sc.next();
        System.out.println("plese enter marks");
        double b=sc.nextDouble();
        System.out.println("plese enter roll number");
        int c=sc.nextInt();
        System.out.println("the name is="+a);
        System.out.println("the marks is="+b);
        System.out.println("the rollnum is="+c);
        System.out.println("the sum is="+c+b);//wrong method
        System.out.println("the sum is="+(c+b));
        sc.close();
    }
}
