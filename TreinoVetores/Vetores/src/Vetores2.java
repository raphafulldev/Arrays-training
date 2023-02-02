import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        String [] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes [i] = sc.next();

        }
        System.out.println("Nomes lidos:");
        for (String s : nomes) {
            System.out.println(s);
        }

        sc.close();
    }
}
