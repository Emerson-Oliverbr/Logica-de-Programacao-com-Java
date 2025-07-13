public class Main {

	public static void main(String[] args) {
		
		int x, y, x2, y2;
		double b, B, h, area;
		
		x = 5;
		y = 2 * x;		
		System.out.println(x);
		System.out.println(y + "\n");
		
		x2 = 5;
		y2 = 2 * x2;		
		System.out.println(x2);
		System.out.println(y2 + "\n");
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("Area => " + area + "\n");
		
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		
		resultado = (double) n1 / n2;
		
		System.out.println(resultado);
		
	}
}
