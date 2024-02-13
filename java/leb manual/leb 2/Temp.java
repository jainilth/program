import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter temprature in F");
        double F=sc.nextDouble();
        double c;
        c=((F-32)*5)/9;
        System.out.println("your ans is"+c);
        sc.close();
    }
}
