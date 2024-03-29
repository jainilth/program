public class OddEven {
    public static void main(String[] args) {
        Runnable r1 = new OddNumber();
        Runnable r2 = new EvenNumber();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
class OddNumber implements Runnable{
    public void run() {
        try {
            for(int i=0;i<=20;i++){
                if(i%2==0){
                    System.out.println(i);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class EvenNumber implements Runnable{
    public void run() {
        try {
            for(int i=0;i<=20;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}