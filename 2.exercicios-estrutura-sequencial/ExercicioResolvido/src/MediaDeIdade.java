import java.util.Locale;
import java.util.Scanner;

public class MediaDeIdade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double mediaDeIdade = (idade1 + idade2) / 2.0;
		
		System.out.printf("Idade media = %.1f%n", mediaDeIdade);
		sc.close();
	}

}
