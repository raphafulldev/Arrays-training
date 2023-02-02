import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados");

        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            if (media >= 6){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
