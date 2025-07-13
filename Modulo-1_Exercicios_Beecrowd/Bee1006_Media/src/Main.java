import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		double MEDIA = (A * 2f + B * 3f + C * 5f) / 10f;
		
		System.out.printf("MEDIA = %.1f%n ", MEDIA);

		sc.close();
	}

}
