import java.io.*;

public class Replace {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("def.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("def.txt"));
            pw.write("word my word wordis my word.\nWord word all the word");
            String line;
            while ((line = br.readLine()) != null) {
                String[] word=line.split("//s+");
                for(int i=0;i<=word.length;i++){
                    System.out.println(word[i].indexOf("word"));
                }
            }
            pw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException b) {
            b.printStackTrace();
        }
    }
}
