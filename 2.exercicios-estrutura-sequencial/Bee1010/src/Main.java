import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, qtdePeca1, codPeca2, qtdePeca2;
		double precoPeca1, precoPeca2;
		
		codPeca1 = sc.nextInt();
		qtdePeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		qtdePeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		double valorAPagar = (qtdePeca1 * precoPeca1) + (qtdePeca2 * precoPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorAPagar);
		sc.close();

	}

}
