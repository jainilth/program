import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter total marks");
        int tm = sc.nextInt();
        int m1, m2, m3, m4, m5;
        do {
            System.out.println("plese enter m1 marks");
            m1 = sc.nextInt();
        } while (tm < m1 || m1 < 0);
        do {
            System.out.println("plese enter m2 marks");
            m2 = sc.nextInt();
        } while (tm < m2 || m2 < 0);
        do {
            System.out.println("plese enter m3 marks");
            m3 = sc.nextInt();
        } while (tm < m3 || m3 < 0);
        do {
            System.out.println("plese enter m4 marks");
            m4 = sc.nextInt();
        } while (tm < m4 || m4 < 0);
        do {
            System.out.println("plese enter m5 marks");
            m5 = sc.nextInt();
        } while (tm < m5 || m5 < 0);
        double per = ((m1 + m2 + m3 + m4 + m5) / tm) * 100 / 5.0;
        if (per >= 60) {
            System.out.println("you got first divison");
        } else if (per > 50) {
            System.out.println("you got second divison");
        } else if (per > 40) {
            System.out.println("you got third divison");
        } else {
            System.out.println("ooops toy are failed");
        }
        sc.close();
    }
}
