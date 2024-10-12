import java.util.Scanner;

public class Temprature {
    float f;
    float c;
    public void CToF(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of value of c : ");
        c = sc.nextFloat();
        f = (c*(9/5))+32;
        System.out.println("Tempature in F : "+f);
        sc.close();
    }
    public void FToC(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of f : ");
        f = sc.nextFloat();
        c = (f-35)*(5/9);
        System.out.println("Tempature in C : "+c);
        sc.close();
    }public static void main(String[] args) {
        Temprature t = new Temprature();
        t.CToF();
        t.FToC();
    }
}
