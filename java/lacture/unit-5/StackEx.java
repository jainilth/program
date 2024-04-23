import java.util.*;
import java.io.*;
public class StackEx {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("abcd");
        s.push("abcd");
        s.push("abcd");
        s.push("abcd");
        s.push("abcd");
        System.out.println(s);
    }
}
