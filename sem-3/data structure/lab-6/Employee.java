import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Employee_Detail e1 = new Employee_Detail();
        e1.setDetail();
        e1.display();
    }
}
class Employee_Detail{
    long Employee_ID;
    String Name,Designation; 
    double salary;
    void setDetail(){
        Scanner sc =new Scanner(System.in);
        Employee_ID=sc.nextInt();
        Name=sc.next();
        Designation=sc.next();
        salary=sc.nextDouble();
        sc.close();
    }
    void display(){
        System.out.println("Employee ID: "+Employee_ID);
        System.out.println("Name: "+Name);
        System.out.println("Designation: "+Designation);
        System.out.println("Salary: "+salary);
    }
}