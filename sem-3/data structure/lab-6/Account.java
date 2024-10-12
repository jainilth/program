import java.util.*;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("plese enter what you want deposite or withdraw");
            System.out.println("you have the option 1 or 2");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("what amount you want deposite");
            } else if (n == 2) {
                System.out.println("what amount you want withdraw");
            } else {
                break;
            }
            double a = sc.nextDouble();
            System.out.println("enter your balance");
            double b = sc.nextDouble();
            System.out.println("please enter account number and name");
            int c = sc.nextInt();
            String d = sc.next();
            BankAccount b1 = new BankAccount(n, a, b, c, d);
            b1.whichDoYouWant();
            b1.displayInfo();
        }
        sc.close();
    }
}

class BankAccount {
    private double balance;
    int n;
    double a;
    int b;
    String c;

    BankAccount(int n, double a, double balance, int b, String c) {
        this.balance = balance;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void whichDoYouWant() {
        if (n == 1) {
            withdrawMoney();
        } else if (n == 2) {
            depositMoney();
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("plese enter re enter which operation you want\n you have two choise 1 or 2");
            n = sc.nextInt();
            sc.close();
        }
    }

    public void displayInfo() {
        System.out.println(balance);
        System.out.println(c);
    }

    public void withdrawMoney() {
        try {
            if (balance - a < 0) {
                throw new NotEnoughMoney();
            } else {
                balance = balance - a;
                System.out.println("your balance is" + balance);
            }
        } catch (NotEnoughMoney e) {
            e.printStackTrace();
        }
    }

    public void depositMoney() {
        balance = balance + a;
        System.out.println("your balance is" + balance);
    }
}

class NotEnoughMoney extends Exception {
    NotEnoughMoney() {
        super("you don't have enough money");
    }
}