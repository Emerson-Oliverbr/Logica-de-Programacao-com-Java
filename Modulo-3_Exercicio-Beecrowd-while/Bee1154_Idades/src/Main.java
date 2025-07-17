import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idades = sc.nextInt();
		
		int quantidadeDeIdadesDigitadas = 0;
		int somaDasIdades = 0;
		double mediaDeIdade = 0.0;
		
		while (idades >= 0) {
			quantidadeDeIdadesDigitadas += 1;
			somaDasIdades += idades;
			idades = sc.nextInt();
		}
		
		double mediaDeIdades = (double) somaDasIdades / quantidadeDeIdadesDigitadas;
		
		System.out.println(mediaDeIdades);
		
		sc.close();
	}

}
