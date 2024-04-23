import java.util.*;
import java.io.*;
public class CompareName {
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
class AgeComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
} 
