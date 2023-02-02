import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int mat [][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();

            }
        }
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat [i][j] < 0){
                    System.out.println(mat [i][j]);
                }
            }
        }

        sc.close();
    }
}
