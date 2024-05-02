//copy cunstructor
// A copy constructor is a special constructor in Java that creates a new object by copying the values from an existing object of the same class.
// It ensures that changes made to the copy do not affect the original object and vice versa.
// Copy constructors are useful for creating deep copies of objects
public class CopyCon {
    public static void main(String[] args) {
        Student s1=new Student(12, 14);
        Student s2=new Student(s1);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s2.age);
        System.out.println(s2.roll);
    }    
}
class Student{
    int roll;
    int age;
    Student(int roll,int age){
        this.roll=roll;
        this.age=age;
    }
    Student(Student mainStu){
        this.roll=mainStu.roll;
        this.age=mainStu.age;
    }
}