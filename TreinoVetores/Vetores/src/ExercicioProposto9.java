import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExercicioProposto9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        String[] produto = new String[n];
        double[] compra = new double[n];
        double[] venda = new double[n];

        double totalCompra = 0;
        double totalVenda = 0;


        for (int i = 0; i < n; i++) {
            produto[i] = sc.next();
            compra[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
            totalCompra += compra[i];
            totalVenda += venda[i];
        }
        int contAbaixo10 = 0;
        int entre10e20 = 0;
        int acimaDe20 = 0;

        for (int i = 0; i < n; i++) {
            double lucro = venda[i] - compra[i];
            double porcentagemDeLucro = lucro / compra[i] * 100;

            if (porcentagemDeLucro < 10) {
                contAbaixo10++;
            } else if (porcentagemDeLucro >= 10 && porcentagemDeLucro <= 20) {
                entre10e20++;
            } else if (porcentagemDeLucro > 20) {
                acimaDe20++;
            }
        }
        double lucroTotal = totalVenda - totalCompra;
        System.out.println("Lucro abaixo de 10%: " + contAbaixo10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro acima de 20%: " + acimaDe20);
        System.out.printf("Valor total de compra: %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: %.2f\n", totalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

        sc.close();
    }
}
