import java.util.*;
public class LearnList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(10));
        // System.out.println(list);
        // list.add(2);
        // list.remove(Integer.valueOf(1));  remove specifird object numbered :-1
        // list.remove(1);  remove element which's index is 1
        // list.addAll(list2);
        System.out.println(list);   
        list.removeAll(list2);  //remove element form 1 which are same as list 2
        list.retainAll(list2);  //give intersection between list
        System.out.println(list);
    }
}