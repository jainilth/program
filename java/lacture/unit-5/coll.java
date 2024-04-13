import java.util.*;
import java.io.*;
public class coll {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        System.out.println(c1);
        c1.clear();
        System.out.println(c1);
    }
}
