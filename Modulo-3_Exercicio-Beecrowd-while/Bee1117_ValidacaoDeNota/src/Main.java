import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		while(nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		double nota2 = sc.nextDouble();
		while(nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2.0;
		
		System.out.printf("Media %.2f%n", media);
		
		sc.close();
	}

}
