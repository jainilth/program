import java.io.*;
public class Filename {
    public static void main(String[] args) {
        File f1=new File("Filename.java");
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getParent());
        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.isAbsolute());
        System.out.println(f1.lastModified());
        System.out.println(f1.length());
    }
}
