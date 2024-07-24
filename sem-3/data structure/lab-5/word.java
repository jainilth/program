import java.util.*;
public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plese enter total element");
        int n=sc.nextInt();
        String s[]=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
        }
        int a=(int)(Math.random()*n-1);
        System.out.println(a);
        String s1=s[a];
        System.out.println("plese enter a word");
        String s2=sc.next();
        char b[]=new char[s1.length()];
        char d[]=new char[s1.length()];
        boolean flag=true;
        if(s1.length()!=s2.length()){
            System.out.println("not");
        }
        else{
            for (int i = 0; i < s1.length(); i++) {
                b[i]=s1.charAt(i);
                d[i]=s2.charAt(i);
            }
            Arrays.sort(b);
            Arrays.sort(d);
            for (int i = 0; i < s1.length(); i++) {
                if(b[i]==d[i]){
                    flag=true;
                }
                else{
                    System.out.println("not");
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            }
        }
        sc.close();
    }
}
