import java.util.Scanner;

public class PascalTriangle {
    static int fac(int num) {
        int ans = 1;
        for (int i = num; i >= 1; i--) {
            ans = ans * i;
        }
        return ans;
    }
    static int ncr(int n, int r) {
        int ans;
        ans = fac(n) / (fac(n - r) * fac(r));
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                int ncrs = ncr(i, j);
                System.out.print("  "+ncrs+" ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
