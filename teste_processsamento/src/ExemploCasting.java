
public class ExemploCasting {

	public static void main(String[] args) {
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		//resultado = a / b;//perde valor
		resultado =(double) a / b;//casting
		
		System.out.println(resultado);

	}

}
