import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		
		//Esse exerc�cio faz a soma dos n�meros inteiros digitados no console, 2 n�meros de cada vez. 
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		sc.nextLine();
		System.out.println("A soma �:");
		System.out.println(x + y);
				
		
		sc.close();
		
		
	}

}
