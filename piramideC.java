import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Número de filas: ");
		int nfilas = scan.nextInt();

		for (int i = 0; i < nfilas; i++) {
			for (int j = nfilas; j > i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
