import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class ExcercioProposto2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        int [] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet [i] = sc.nextInt();
        }
        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (vet [i] % 2 == 0){
                cont++;
                System.out.print(vet [i] + " ");
            }
        }
        System.out.println();
        System.out.println(cont);

        sc.close();
    }
}
