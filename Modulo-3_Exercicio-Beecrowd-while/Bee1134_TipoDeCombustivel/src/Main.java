import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			
		
		int alcool = 0, gasolina = 0, diesel = 0;
		
		int tipoDeCombustivel = sc.nextInt();	
		
		while(tipoDeCombustivel != 4) {
			
			if(tipoDeCombustivel == 1) {
				alcool+= 1;
			}
			else if(tipoDeCombustivel == 2) {
				gasolina +=1;
			}
			else if (tipoDeCombustivel == 3) {
				diesel +=1;
			}

			tipoDeCombustivel = sc.nextInt();
		}
		
		
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool "+ alcool);
		System.out.println("Gasolina "+ gasolina);
		System.out.println("Diesel " + diesel);
		
		sc.close();

	}

}
