import java.util.*;
import java.io.*;
public class Compare {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("vijay",23));
        al.add(new Student("ajay",27));
        al.add(new Student("jay",21));
        System.out.println("sorting by age");
        Collections.sort(al,new AgeComparator());
        Iterator<Student> itr=al.iterator();
        while (itr.hasNext()) {
            Student st=(Student)itr.next();
            System.out.println(st.name+" "+st.age);
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
}
class AgeComparator implements Comparator<Object>{
    public int compare(Object o1,Object o2){
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        if(s1.age==s2.age) return 0;
        else if(s1.age>s2.age) return 1;
        else return -1;
    }
} 
