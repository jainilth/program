public class Application {
    public static void main(String[] args) {
        Runnable r1 = new Gm("good morning");
        Runnable r2 = new Ga("good afternoon");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

class Gm implements Runnable {
    String str;

    Gm(String str) {
        this.str = str;
    }

    public void run() {
        try {
            while (true) {
                System.err.println(str);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Ga implements Runnable {
    String str;

    Ga(String str) {
        this.str = str;
    }

    public void run() {
        try {
            while (true) {
                System.err.println(str);
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
