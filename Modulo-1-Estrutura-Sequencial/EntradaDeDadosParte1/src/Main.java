import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double preco;
		double altura;
		char letra;
		
		nome = sc.next();
		idade = sc.nextInt();
		preco = sc.nextDouble();
		altura = sc.nextDouble();
		letra = sc.next().charAt(0);
		
		System.out.println("Dados digítados: ");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(preco);		
		System.out.printf("Alturea: %.2f%n", altura);
		System.out.println(letra);
		
		sc.close();
	}
}
