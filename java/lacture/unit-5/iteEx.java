import java.util.*;
import java.io.*;
public class iteEx {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("abc");
        c1.add("def");
        c1.add("ghi");
        c1.add("jkl");
        c1.add("mnp");
        System.out.println(c1);
        Iterator<String> itr=c1.iterator();
        while (itr.hasNext()) {
            Object element=itr.next();
            System.out.print(element+" ");
        }
    }
}
