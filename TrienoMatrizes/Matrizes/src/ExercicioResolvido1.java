import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioResolvido1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int contNegativos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat [i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    contNegativos++;
                }
            }
        }
        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
                i++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de negativos = " + contNegativos);

        sc.close();
    }
}
