import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double valorHora, salarioLiquido;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		salarioLiquido = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salarioLiquido);
		
		sc.close();

	}

}
