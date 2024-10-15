import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		System.out.printf("Bienvenido a la Lotería!%n");
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		//Apuesta del usuario:

		ArrayList<Integer> apuesta = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			String[] orden = {"Primer", "Segundo", "Tercer", "Cuarto", "Quinto", "Sexto"};
			System.out.printf("%nIntroduzca %s número de su apuesta (1 a 49): ", orden[i]);
			int num = scan.nextInt();

			if (num > 49 || num < 1) {
				System.out.printf("%nNúmero incorrecto; solamente del 1 al 49. ");
				i = i - 1;
			} else if (apuesta.contains(num)) {
				System.out.printf("%nNúmero ya introducido. ");
				i = i - 1;
			} else {
				apuesta.add(num);
			}
		}
			
		System.out.printf("%nSu apuesta: " + apuesta);

		//Números ganadores:
		
		ArrayList<Integer> ganadores = new ArrayList<Integer>();

		for (int i = 1; i < 7; i++) {
			int num = rand.nextInt(49) + 1;

			if (ganadores.contains(num)) {
				i = i - 1;
			} else {
				ganadores.add(num);
			}
		}
		
		System.out.printf("%nLos números ganadores: " + ganadores);

		//Aciertos:
		
		apuesta.retainAll(ganadores);

		System.out.printf("%nAciertos: " + apuesta.size() + ": " + apuesta + "%n");
	}
}
