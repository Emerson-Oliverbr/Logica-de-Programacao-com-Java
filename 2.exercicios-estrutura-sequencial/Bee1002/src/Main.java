import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		
		double area = n * raio * raio;
		
		System.out.printf("%.4f%n" ,area);
		
		sc.close();
	}

}
