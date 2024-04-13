import java.util.*;
import java.io.*;
public class Fin {
    public static void main(String[] args) throws Exception {
        int count=0,i;
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("enter a word which you ant to find");
        ch=sc.next().charAt(0);
        File f=new File(args[0]);
        BufferedReader br=new BufferedReader(new FileReader(f));
        while ((i=br.read())!=-1) {
            if(i==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
