import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char s='a';
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(s++);  
                }
                else{
                    System.out.print(num++);
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
