import java.util.Scanner;
public class special2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter a string");
        String s=sc.nextLine();
        System.out.println(s.contains("a"));
        sc.close();
    }
}
