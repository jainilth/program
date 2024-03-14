public class Compu {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int ans = 1;
            if (x == 0 || y == 0) {
                throw new InvalidNum();
            }
            if (y < 0) {
                throw new InvalidNum();
            } else {
                for (int i = 1; i <= y; i++) {
                    ans = ans * x;
                }
                System.out.println(ans);
            }
        } catch (ArrayIndexOutOfBoundsException c) {
            System.out.println("plese enter 2 int");
        } catch (InvalidNum a) {
            a.printStackTrace();
        } catch (Exception b) {
            System.out.println("plese enter only numbers");
        }
    }
}

class InvalidNum extends Exception {
    InvalidNum() {
        super("invalid number");
    }
}