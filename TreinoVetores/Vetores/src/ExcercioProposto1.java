import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExcercioProposto1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        
        double [] vet = new double[n];
        int pos = 0;
        double maior = vet[0];

        for (int i = 0; i < n; i++) {
            vet [i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (vet [i] > maior){
                maior = vet[i];
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);


        sc.close();
    }
}
