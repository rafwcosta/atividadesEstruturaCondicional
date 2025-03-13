import java.util.Locale;
import java.util.Scanner;

public class Conditional06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor de 0 a 100: ");
        int valor = sc.nextInt();

        if (valor < 0 || valor > 100) {
            System.out.println("Fora do intervalo.");
        }
        else if (valor <= 25) {
            System.out.println("[0,25]");
        }
        else if (valor <= 50) {
            System.out.println("[25,50]");
        }
        else if (valor <= 75) {
            System.out.println("[50,75]");
        }
        else {
            System.out.println("[75,100]");
        }

        sc.close();
    }
}