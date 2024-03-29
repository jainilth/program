import java.util.Scanner;

public class Sent53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese eter your string");
        while (true) {
            String s = sc.nextLine();
            if (s.equals("quit")) {
                break;
            } else {
                s.toLowerCase();
                Count.countVowels(s);
            }
        }
        System.out.println("the total number of a&A is:" + Count.An);
        System.out.println("the total number of e&E is:" + Count.En);
        System.out.println("the total number of i&I is:" + Count.In);
        System.out.println("the total number of o&O is:" + Count.On);
        System.out.println("the total number of u&U is:" + Count.Un);
    }
}

class Count {
    static int An = 0;
    static int En = 0;
    static int In = 0;
    static int On = 0;
    static int Un = 0;

    static void countVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                An++;
            }
            else if(s.charAt(i)=='e'){
                En++;
            }
            else if(s.charAt(i)=='i'){
                In++;
            }
            else if(s.charAt(i)=='o'){
                On++;
            }
            else if(s.charAt(i)=='u'){
                Un++;
            }
        }
    }
}
