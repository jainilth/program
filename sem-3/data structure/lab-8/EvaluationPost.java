import java.util.*;

public class EvaluationPost {
    public static double eval(String s) {
        Stack<String> st = new Stack<>();
        String a[] = s.split(",");
        double opr1 = 0;
        double opr2 = 0;
        double ans = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("+") || a[i].equals("-") || a[i].equals("*") || a[i].equals("/") || a[i].equals("%")) {
                opr2 = Double.parseDouble(st.pop());
                opr1 = Double.parseDouble(st.pop());
                switch (a[i]) {
                    case "+":
                        ans = opr1 + opr2;
                        st.push(String.valueOf(ans));
                        break;
                    case "-":
                        ans = opr1 - opr2;
                        st.push(String.valueOf(ans));
                        break;
                    case "*":
                        ans = opr1 * opr2;
                        st.push(String.valueOf(ans));
                        break;
                    case "/":
                        ans = opr1 / opr2;
                        st.push(String.valueOf(ans));
                        break;
                    case "%":
                        ans = opr1 % opr2;
                        st.push(String.valueOf(ans));
                        break;
                    default:
                        break;
                }
            } else {
                st.push(a[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double ans = eval(s);
        System.out.println(ans);
    }
}
