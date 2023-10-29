import java.util.Scanner;
//import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String palavra1, palavra2, palavra3;
		
		numero = sc.nextInt();
		sc.nextLine();
		palavra1 = sc.nextLine();
		palavra2 = sc.nextLine();
		palavra3 = sc.nextLine();
		
		System.out.println("Dados digitados");
		System.out.println(numero);
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		
		sc.close();
	}

}
