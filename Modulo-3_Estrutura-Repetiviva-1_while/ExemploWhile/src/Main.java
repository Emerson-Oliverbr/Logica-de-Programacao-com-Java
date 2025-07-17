import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			System.out.print("Digite um numero: ");
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Total digitado => " + soma);
		sc.close();
	}

}
