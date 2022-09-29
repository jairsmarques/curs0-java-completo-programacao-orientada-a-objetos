import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		System.out.print("Digite o seu nome: ");
		x = sc.next();
		System.out.print("Digite o sua idade: ");
		y = sc.nextInt();
		System.out.print("Digite o sua altura: ");
		z = sc.nextDouble();
		
		System.out.println("Seu nome é: " + x);
		System.out.println("Sua idade é: " + y);
		System.out.println("Sua altura é: " + z);
		
		sc.close();
	}

}
