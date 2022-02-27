import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		
		//Esse exercício faz a soma dos números inteiros digitados no console, 2 números de cada vez. 
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		sc.nextLine();
		System.out.println("A soma é:");
		System.out.println(x + y);
				
		
		sc.close();
		
		
	}

}
