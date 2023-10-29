import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//String x;
		
		//x = sc.next();
		//System.out.println("Voce digitou: " + x);
		
		//int n1;
		//double n2;
		//char y;
		
		//n1 = sc.nextInt();
		//n2 = sc.nextDouble();
		//System.out.println("Tú digitastes: " + n1);		
		//System.out.printf("Tú digitastes: %.2f%n" , n2);
		
		//y = sc.next().charAt(0);
		//System.out.println("Tú digitastes:" + y);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados diditados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();		

	}

}
