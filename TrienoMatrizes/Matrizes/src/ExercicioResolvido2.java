import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioResolvido2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        double[][] mat = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < m; i++) {
            double soma = 0;
            for (int j = 0; j < n; j++) {
                soma += mat[i][j];
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
