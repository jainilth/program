import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        fruit.push("adf");
        fruit.push("saddf");
        fruit.push("adsaf");
        fruit.push("adfdvsg");
        fruit.push("adfaaWW");
        System.out.println(fruit);
        System.out.println(fruit.pop());
        System.out.println(fruit);
        System.out.println(fruit.peek());
        System.out.println(fruit);
    }
}
