		import java.util.Locale;
		import java.util.Scanner;
		
public class Exercise {

	public static void main(String[] args) {
		//Esse exercicio calcula a area do raio (numero inserido no console)
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio;
		double area;
		double pi;
		double a;
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		sc.nextLine();
		
		a = Math.pow(raio, 2);
		area = pi*a;
		
		System.out.printf("O valor da área é de: %.4f%n", area);
		
		
		sc.close();
		
	}

}
