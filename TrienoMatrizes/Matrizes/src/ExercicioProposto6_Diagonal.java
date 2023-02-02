import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto6_Diagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        double[][] mat = new double[n][n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat [i][j] = sc.nextDouble();
                if (mat[i][j] > 0){
                    soma += mat [i][j];
                }
            }
        }
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        System.out.printf("SOMA DOS POSITIVOS: %.1f\n", soma);
        System.out.print("LINHA ESCOLHIDA: ");

        for (int i = linha; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
            i++;
        }

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            for (int j = coluna; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat [i][j] + " ");
                i++;
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > 0){
                    System.out.print(mat [i][j] + " ");
                }else {
                    System.out.print(Math.pow(mat [i][j],2) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
