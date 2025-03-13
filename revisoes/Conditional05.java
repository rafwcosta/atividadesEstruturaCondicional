import java.util.Locale;
import java.util.Scanner;

public class Conditional05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Lista de itens: ");
        System.out.println("1. Cachorro quente | R$ 4,00");
        System.out.println("2. X-salada | R$ 4,50");
        System.out.println("3. X-bacon | R$ 5,00");
        System.out.println("4. Torrada | R$ 2,00");
        System.out.println("5. Refrigerante | R$ 1,50");
        System.out.println();
        System.out.print("Digite o código do item: ");
        int codigo = sc.nextInt();

        if (codigo < 1 || codigo > 5) {
            System.out.println("Código inválido, reinicie o código novamente.");
            sc.close();
            return;
        }

        System.out.print("Quantidade desse item: ");
        int quantidade = sc.nextInt();

        double total = 0;
        if (codigo == 1) {
            total = 4.0 * quantidade;
        }
        else if (codigo == 2) {
            total = 4.5 * quantidade;
        }
        else if (codigo == 3) {
            total = 5.0 * quantidade;
        }
        else if (codigo == 4) {
            total = 2.0 * quantidade;
        }
        else {
            total = 1.5 * quantidade;
        }

        System.out.printf("Total a pagar: R$%.2f%n", total);

        sc.close();
    }
}