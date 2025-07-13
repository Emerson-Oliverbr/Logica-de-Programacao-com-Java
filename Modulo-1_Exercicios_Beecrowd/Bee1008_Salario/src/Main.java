import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoFuncionario = sc.nextInt();
		int quantidadeDeHorasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		System.out.println("NUMBER = " + codigoFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", quantidadeDeHorasTrabalhadas * valorPorHora );
		
		sc.close();
	}

}
