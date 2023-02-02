import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }

        sc.close();
    }
}

