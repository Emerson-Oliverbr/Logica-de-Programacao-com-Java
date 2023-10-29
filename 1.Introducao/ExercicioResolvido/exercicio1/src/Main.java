import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		double largura, comprimento, valorMetroQuadrado, area, preco;
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorMetroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valorMetroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);		
		
		sc.close();		

	}

}
