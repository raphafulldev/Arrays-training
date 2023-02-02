import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        String [] nome = new String[n];
        int [] idade = new int[n];


        for (int i = 0; i < n; i++) {
            nome [i] = sc.next();
            idade [i] = sc.nextInt();
        }
        int maior = idade [0];
        int nomeMaisVelho = 0;

        for (int i = 0; i < n; i++) {
            if (idade [i] > maior){
                maior = idade [i];
                nomeMaisVelho = i;
            }
        }
        System.out.println("Pessoa mais velha: " + nome [nomeMaisVelho]);

        sc.close();
    }
}
