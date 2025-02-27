import java.util.Scanner;
import java.util.Locale;

public class question01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo.");
        }
        else {
            System.out.println("Negativo.");
        }

        sc.close();
    }
}