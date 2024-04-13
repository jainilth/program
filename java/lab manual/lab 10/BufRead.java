import java.io.*;

public class BufRead {
    public static void main(String[] args) {
        try{
            BufferedReader f1=new BufferedReader(new FileReader("def.txt"));
            char c[]=new char[20];
            f1.skip(8);
            if(f1.ready()){
                System.out.println(f1.readLine());
                f1.read(c);
                for(int i=0;i<20;i++){
                    System.out.print(c[i]);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
