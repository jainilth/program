import java.util.Scanner;

public class cricketscoreboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tw=0;
        int[][] run = new int[5][6];
        for (int i = 0; i < 5; i++) {
            int j = 0;
            for (j = 0; j < 6; j++) {
                System.out.println("plese enter your score in " + (i + 1) + "th over and " + (j + 1) + "th ball");
                run[i][j] = sc.nextInt();
                if (run[i][j]!=50&&(run[i][j] > 6 || run[i][j] == 51)) {
                    do {
                        System.out
                                .println("plese enter your score in " + (i + 1) + "th over and " + (j + 1) + "th ball");
                        run[i][j] = sc.nextInt();
                    } while (run[i][j]!=50&&(run[i][j] > 6 || run[i][j] == 51));
                }
            }
        }
        // for wicket=50
        // for no ball or wide=51

        int ts = 0;
        int over = 0;
        for (int i = 0; i < 5; i++) {
            int j;
            for (j = 0; j < 6; j++) {
                ts = ts + run[i][j];
            }
            for (j = 0; j < 6; j++) {
                if (run[i][j] == 50) {
                    tw++;
                }
            }
            over++;
        }
        System.out.println("the score is:-" + ts + " run" + " - " + tw + " wicket" + " - " + over + " over");
        sc.close();
    }
}