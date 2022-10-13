package lt.lhu.unit07.main;

/*
 * сортировка 100 даблов прямым перебором по убыванию
 */
import java.util.Random;

public class Task22 {

	public static void main(String[] args) {

		double[] arr = new double[100];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble();
		}

		System.out.print("Ishodnyj massiv:\t\t ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4f ", arr[i]);
		}
		System.out.println();

		double temp;
		int max;
		for (int i = 0; i < arr.length; i++) {
			max = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;

		}
		System.out.print("Sortirovannyj massiv:\t\t ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4f ", arr[i]);
		}
		System.out.println();

	}

}
