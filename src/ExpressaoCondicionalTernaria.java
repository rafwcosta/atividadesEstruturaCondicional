
import java.util.Scanner;
import java.util.Locale;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto: " + desconto);

        sc.close();
    }
}

// O código abaixo, seria o padrão estudado até o momento, utilizando if-else. Veja como o código acima foi simplificado drasticamente, tendo o mesmo resultado.

/*
    double preco = 34.5;
    double desconto;

    if (preco < 20.0) {
        desconto = preco * 0.1;
    }
    else {
        desconto = preco * 0.05;
    }
    
    System.out.println("Desconto: " + desconto);
*/