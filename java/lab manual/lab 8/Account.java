import java.util.*;
public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter what you want deposite or withdraw");
        System.out.println("you have the option 1 or 2");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("what amount you want deposite");
        }
        else if(n==2){
            System.out.println("what amount you want withdraw");
        }
        else{
            System.out.println("plese enter re enter which operation you want\n you have two choise 1 or 2");
            n=sc.nextInt();
        }
        double a=sc.nextDouble();
        BankAccount b1=new BankAccount(n,a);
        b1.whichDoYouWant();
        sc.close();
    }
}
class BankAccount{
    private double balance=10000;
    int n;
    double a;
    BankAccount(int b,double a){
        n=b;
        this.a=a;
    }
    public void whichDoYouWant(){
        if(n==1){
            withdrawMoney();
        }
        else if(n==2){
            depositMoney();
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("plese enter re enter which operation you want\n you have two choise 1 or 2");
            n=sc.nextInt();
            sc.close();
        }
    }
    public void withdrawMoney(){
        try{
            if(balance<0){
                throw new NotEnoughMoney();
            }
            else{
                balance=balance-a;
                System.out.println("your balance is"+balance);
            }
        }
        catch(NotEnoughMoney e){
            e.printStackTrace();
        }
    }
    public void depositMoney(){
        balance=balance+a;
        System.out.println("your balance is"+balance);
    }
}
class NotEnoughMoney extends Exception{
    NotEnoughMoney(){
        super("you don't have enough money");
    }
}
// WAP to create Account class, which is representing a bank account 
// where  we  can  deposit  and  withdraw  money.  if  we  want  to  withdraw 
// money which exceed our bank balance? We will not be allowed, create 
// InSufficientFundException  to  handle  above  situation  and  display 
// proper error message