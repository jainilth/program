public class rolladd {
    public static void main(String[] args) {
        System.out.println("roll num:"+args[0]);
        System.out.println("sem:"+args[1]);
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        int add=num1+num2;
        System.out.println(add);
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        System.out.println(a*b);
    }     
}
