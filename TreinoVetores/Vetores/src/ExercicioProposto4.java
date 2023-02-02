import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        double[] vet = new double[n];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
            media = soma / n;
        }

        System.out.println(media);

        for (int i = 0; i < n ; i++) {
            if (vet [i] < media){
                System.out.println(vet [i]);
            }
        }


        sc.close();
    }
}
