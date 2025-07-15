import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		
		if(notaFinal < 60.0) {
			System.out.printf("Nota final = %.1f%n", notaFinal);
			System.out.println("Aluno reprovado");
		}
		else {
			System.out.println("Aluno Aprovado");
			System.out.printf("Nota final = %.1f%n", notaFinal);
		}
		
		sc.close();
	}

}
