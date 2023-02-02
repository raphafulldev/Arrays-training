import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Vetores1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        double soma = 0;

        int contIdade = 0;

        for (int i = 0; i < n; i++) {

            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
            soma += altura[i];
            if (idade[i] < 16) {
                contIdade++;
            }
        }
        double mediaAltura = soma / n;
        System.out.printf("Altura media: %.2f\n", mediaAltura);
        double percentual = (double) contIdade * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f %%\n", percentual);

        sc.close();
    }
}
