import java.util.Locale;
import java.util.Scanner;

public class exercise_products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int cod, qtd, cod2, qtd2;
		double unt, total, unt2, total2, total3;
				
		cod = sc.nextInt();
		qtd = sc.nextInt();
		unt = sc.nextDouble();
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		unt2 = sc.nextDouble();
		
		total = (qtd * unt) + (qtd2 * unt2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n ", total);
		
		
		
		sc.close();
	}

}
