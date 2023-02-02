import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int matA[][] = new int[m][n];
        int matB[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matA[i][j] = sc.nextInt();
                matB[i][j] = sc.nextInt();
            }
        }
        int matC[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}

