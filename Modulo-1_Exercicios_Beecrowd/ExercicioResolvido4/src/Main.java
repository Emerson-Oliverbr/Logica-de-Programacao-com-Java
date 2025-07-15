import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalDeVendas = sc.nextDouble();
		
		double salarioLiquido = (salarioFixo + totalDeVendas * 0.15);
		
		System.out.printf("TOTAL = RS %.2f%n", salarioLiquido);
		
		sc.close();
	}

}
