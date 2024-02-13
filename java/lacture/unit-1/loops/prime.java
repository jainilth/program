import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("plese enter a number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            count++;
            }
        }
        if(count==2){
            System.out.println("the given number is prime");
        }
        else{
            System.out.println("the given number is not prime");
        }
        sc.close();
    }
}
