import java.util.Scanner;
import java.util.Locale;

public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do salário: ");
        double salario = sc.nextDouble();

        double imposto = 0.0;
        if (salario < 0) {
            System.out.println("Não existe salário negativo, rode o programa novamente.");
        }
        else if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento de imposto.");
        }
        else {
            System.out.printf("Imposto: R$ %.2f%n", imposto);
        }

        sc.close();
    }
}