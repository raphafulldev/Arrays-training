import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] sexo = new char[n];
        int contM = 0;
        int contF = 0;
        double media = 0;
        double soma = 0;
        for (int i = 0; i < n; i++) {

            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
            if (sexo[i] == 'M') {
                contM++;
            } else if (sexo[i] == 'F') {
                contF++;
                soma += altura[i];
                media = soma / contF;
            }
        }
        double maior = altura[0];
        double menor = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }
        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Media das alturas da mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + contM);
        sc.close();
    }
}
