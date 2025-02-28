import java.util.Scanner;
import java.util.Locale;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos.");
        }
        else {
            System.out.println("Não são múltiplos.");
        }

        sc.close();
    }
}