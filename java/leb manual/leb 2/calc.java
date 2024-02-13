import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("plese enter a");
        int a = sc.nextInt();
        System.out.println("plese enter b");
        int b = sc.nextInt();
        System.out.println("plese enter which operation you want");
        System.out.println("your choise ih A,S,M,D");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'A':
                System.out.println("the ans is"+(a+b));
                break;
            case 'S':
                System.out.println("the ans is"+(a-b));
                break;
            case 'M':
                System.out.println("the ans is"+(a*b));
                break;
            case 'D':
                System.out.println("the ans is"+((double)a/b));
                break; 
            default:
                System.out.println("invalid operation");  
        } 
        sc.close();
    }
}
