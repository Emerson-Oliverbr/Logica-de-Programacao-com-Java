import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nomeVendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendasEmDinheiro = sc.nextDouble();
		
		double salarioLiquido = salarioFixo + totalVendasEmDinheiro * 0.15;
		
		System.out.printf("Total = %.2f%n", salarioLiquido);
		
		sc.close();	

	}

}
