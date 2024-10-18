import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Número de filas: ");
		int nfilas = scan.nextInt();

		for (int i = 1; i <= nfilas; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
