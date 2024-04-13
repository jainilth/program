import java.io.*;
public class HandleFile {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter(new FileWriter("abc.txt"));
            pw.write("hello");
            pw.write("my name is jainil\ni study in darshan unversity");
            pw.close();
            BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
            int countline=0;
            int countchar=0;
            int countword=0;
            String line;
            while ((line=br.readLine())!=null) {
                countline++;
                countchar+=line.length();
                countword+=line.split("\\s+").length;
            }
            br.close();
            System.out.println("the total words in file is:"+countword);
            System.out.println("the total char in file is:"+countchar);
            System.out.println("the total line in file is:"+countline);
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }
        catch(IOException b){
            b.printStackTrace();
        }
    }
}
