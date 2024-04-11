// public class Stablock {
//     public static void main(String[] args) {
//         System.out.println("hello world");
//     }
//     static{
//         System.out.println("hello");
//     }
// }
import java.io.*;
public class Stablock {
    public static void main(String[] args) {
        try {
            String line;
            int count=0;
            PrintWriter pw = new PrintWriter("replace.txt");
            pw.write("word1 my word word1is my word.\nWord1 word1 all the word");
            pw.close();
            pw = new PrintWriter("change.txt");
            BufferedReader br= new BufferedReader(new FileReader("replace.txt"));
            while ((line=br.readLine())!=null) {
                /* 
                line= line.replace("word1", "word2");
                pw.write(line+"\n");
                */
                String[] str= line.split("\\s+");
                for (int i = 0; i < str.length; i++) {
                    if(str[i].indexOf("word1")!=-1){
                        str[i]=str[i].replace("word1","word2");
                        count++;
                    }
                }
                line="";
                
                for (int i = 0; i < str.length-1; i++) {
                    line+=str[i]+" ";
                }
                pw.write(line+"\n");
            }
            System.out.println(count+" replacements done!");
            pw.close();
            br.close();

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
