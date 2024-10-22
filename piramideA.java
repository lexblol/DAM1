import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Número de filas: ");
		int nfilas = scan.nextInt();

		for (int i = 0; i < nfilas; i++) {
			for (int j = 0; j < i + 1 ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
