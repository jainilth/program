import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(5);
        s1.add(3);
        s1.add(7);
        s1.add(1);
        System.out.println(s1);
        Set<Integer> s2=new HashSet<>();
        s2.add(5);
        s2.add(8);
        s2.add(7);
        s2.add(2);
        System.out.println(s2);
        s2.retainAll(s1);
        System.out.println(s2);
    }
}
