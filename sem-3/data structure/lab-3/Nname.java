import java.util.*;
public class Nname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter total element");
        int n=sc.nextInt();
        String s[]=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(s[i].compareTo(s[j])<0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
        sc.close();
    }
}