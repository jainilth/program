import java.util.Scanner;
public class positiveornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter a number");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("this number is positive");
        }
        else{
            System.out.println("this number is negetive");
        }
        sc.close();
    }
}