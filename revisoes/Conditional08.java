package revisoes;

import java.util.Locale;
import java.util.Scanner;

public class Conditional08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Entrada
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        // Cálculos utilizando a estrutura condicional if-else
        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        // Saídas
        if (imposto == 0) {
            System.out.println("Isento.");
        }
        else {
            System.out.printf("Imposto de: R$ %.2f%n", imposto);
        }

        sc.close();
    }
}