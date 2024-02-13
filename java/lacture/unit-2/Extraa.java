import java.util.*;
public class Extraa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String un= sc.nextLine();

        if(un.trim().toLowerCase().equals("jainil"))
        {
            System.out.println("String Match");
        }
        else
        {
            System.out.println("String  dose not Match");
        }
        sc.close();
    }
}