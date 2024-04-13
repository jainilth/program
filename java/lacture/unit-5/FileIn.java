import java.io.*;
public class FileIn {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("abc.txt");
            String s="thummar jainil";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("sucess");
        }
        catch(Exception b){
            b.printStackTrace();
        }
    }
}
