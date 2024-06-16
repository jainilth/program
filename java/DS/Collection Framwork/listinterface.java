import java.util.*;
public class listinterface {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(4);
        list.add(8);
        list.get(3);
        System.out.println(list);
        list.set(3, 200);  //set element not add
        list.add(3, 100);  //add element at specified index
        list.remove(0);
        System.out.println(list);
    }
}
