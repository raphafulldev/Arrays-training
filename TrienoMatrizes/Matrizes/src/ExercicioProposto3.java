import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int maior = 0;
            for (int j = 0; j < n; j++) {
                if (mat [i][j] > maior){
                    maior = mat [i][j];
                }
            }
            System.out.println(maior);
        }

        sc.close();
    }
}
