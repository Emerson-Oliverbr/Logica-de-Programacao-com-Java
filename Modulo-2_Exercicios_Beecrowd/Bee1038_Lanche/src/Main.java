import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double totalAPagar = 0.0;
		if(codigo == 1){
            totalAPagar += quantidade * 4.00;
		}
		else if (codigo == 2){
		     totalAPagar += quantidade * 4.50;
		}
		else if(codigo == 3){
		     totalAPagar += quantidade * 5.00;
		}
		else if(codigo == 4){
		     totalAPagar += quantidade * 2.00;
		}
		else if (codigo == 5){
		    totalAPagar += quantidade * 1.50;
		}

		System.out.printf("Total a pagar => %.2f%n", totalAPagar);

		sc.close();
	}

}
