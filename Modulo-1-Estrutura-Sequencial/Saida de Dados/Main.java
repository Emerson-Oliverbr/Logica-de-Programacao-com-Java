import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Hello, World!");
        System.out.println("Boa tarde!");

        int y = 32;
        double x = 10.35784;

        System.out.println("Valor de y: " + y);
        System.out.println("Valor de x: " + x);
        System.out.printf("Valor de x: %.2f%n ", x);
        System.out.printf("Valor de x: %.4f%n ", x);
        System.out.println("Resultado = " + y + "Metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf(
            "%s tem %d anos e ganha R$ %.2f reais%n ",
            nome,
            idade,
            renda
        );
    }
}
