import java.io.*;

public class StudentManager {
    public static void main(String[] args) {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("stu.txt"));
            bw.write("jainil,18\n");
            bw.write("dhaval,18\n");
            bw.write("pratyush,19");
            bw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader br=new BufferedReader(new FileReader("stu.txt"));
            String line;
            while ((line=br.readLine())!=null) {
                String[] nameAge=line.split(",");
                String name=nameAge[0];
                int age=Integer.parseInt(nameAge[1]);
                Student st=new Student(name,age);
                System.out.println(st);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name: "+name+" ,age: "+age;
    }
}
