import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		
		float media = (n1*2f + n2*3f + n3*4f + n4*1f) / 10f;
		
		if(media >= 7f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado");
		}	
		
		else if (media < 5f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno Reprovado");			
		}
		
		else {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			System.out.print("Nota do exame:");
			float notaExame = sc.nextFloat();
			
			float mediaFinal = (media + notaExame) / 2f;
			if(mediaFinal >= 5f) {
				System.out.println("Aluno aprovado");
				System.out.printf("Media final: %.1f%n", mediaFinal);				
			}
			
		}
		
		sc.close();

	}

}
