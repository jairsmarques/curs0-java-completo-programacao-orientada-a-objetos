
public class Exercicio {

	public static void main(String[] args) {
		// Fórmula de Baskara
		
		double a, b, c, delta;
		a = 10;
		b = 8;
		c = -3;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		double x1, x2;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(x1);
		System.out.println(x2);
		
		

	}

}
