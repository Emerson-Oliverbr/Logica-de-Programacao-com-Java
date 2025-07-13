import java.util.Locale;

public class Main {

	public static void main(String[] args) {	
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritorio";
		
		byte idade = 40;
		int codigo = 5290;
		char genero = 'M';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.2345678;
		
		System.out.println("Produtos: ");
		System.out.printf(produto1 + " custa R$ %.2f%n" , preco1);
		System.out.printf(produto2 + " custa R$ %.2f%n" , preco2 , "\n");
		System.out.println("Dados: " + idade + " anos" + " código: " + codigo + " e é do genero " + genero + "\n");
		System.out.printf("Medida com 7 casas decimais: %.7f%n" , medida);
		System.out.printf("Medida com 3 casas decimais: %.3f%n" , medida);		
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com 3 casas decimais e ponto no lugar da virgula: %.3f%n" , medida);		
	}

}
