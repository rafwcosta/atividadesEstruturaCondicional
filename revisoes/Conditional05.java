package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Conditional05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Código do item: ");
        int codigo = sc.nextInt();

        if (codigo < 1 || codigo > 5) {
            System.out.println("O sistema só aceita números de 1 a 5! Reinicie o código novamente.");
            sc.close();
            return;
        }

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}