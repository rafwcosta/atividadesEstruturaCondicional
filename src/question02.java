import java.util.Scanner;
import java.util.Locale;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par.");
        }
        else {
            System.out.println("Ímpar.");
        }

        sc.close();
    }
}