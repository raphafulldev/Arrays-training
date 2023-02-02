import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.mapLibraryName;

public class ExercicioProposto5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        int [] vet = new int[n];
        int cont = 0;
        double soma = 0;
        for (int i = 0; i < n; i++) {
            vet [i] = sc.nextInt();
            if (vet [i] % 2 == 0){
                cont++;
                soma += vet [i];
            }
        }
        double media = (double) soma / cont;
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}
