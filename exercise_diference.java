import java.util.Scanner;

public class exercisesomas {

	public static void main(String[] args) {
		// Esse exerc�cio mostra a diferen�a entre os valores (a * b - c * d)
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, F;
		
		
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		sc.nextLine();
		F = (a * b - c * d);
		System.out.println("Diferen�a: " + F);
		
		sc.close();
	}

}
