import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int numElements = original.length;
		int x = numElements - 1;
		int[] invertida = new int[original.length];
		
		for (int i = x; i >= 0; i--) {
			invertida[x - i] = original[i];
		}

		for (int i = 0; i < numElements; i++) {
			System.out.println(invertida[i]);
		}

		System.out.println(Arrays.toString(invertida));
	}
}
