    import java.util.Scanner;
    import java.util.Locale;

    public class question05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("Selecione 1 opção:");
            System.out.println("1. Cachorro quente (R$ 4,00)");
            System.out.println("2. X-salada (R$ 4,50)");
            System.out.println("3. X-bacon (R$ 5,00)");
            System.out.println("4. Torrada (R$ 2,00)");
            System.out.println("5. Refrigerante (R$ 1,50)");
            System.out.println();
            System.out.print("Código do item: ");
            int codigoItem = sc.nextInt();

            if (codigoItem < 1 || codigoItem > 5) {
                System.out.println("Resposta inválida! O programa aceita o código do item, de 1 a 5.");
                sc.close();
                return;
            }
            else {
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
    
                double total = 0.0;
                if (codigoItem == 1) {
                    total = quantidade * 4.0;
                }
                else if (codigoItem == 2) {
                    total = quantidade * 4.5;
                }
                else if (codigoItem == 3) {
                    total = quantidade * 5.0;
                }
                else if (codigoItem == 4) {
                    total = quantidade * 2.0;
                }
                else {
                    total = quantidade * 1.5; 
                }

                System.out.printf("Valor a pagar: R$ %.2f%n", total);
            }

            sc.close();
        }
    }