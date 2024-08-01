import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.next();
        if(s.equals(s.toLowerCase())){
            s=s.toUpperCase();
        }
        else{
            s=s.toLowerCase();
        }
        System.out.println(s);
    }
}
