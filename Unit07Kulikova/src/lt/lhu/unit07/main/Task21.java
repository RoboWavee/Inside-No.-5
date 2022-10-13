package lt.lhu.unit07.main;

/*
 * сортировка 100 даблов по убыванию "пузырьком"
 */
import java.util.Random;

public class Task21 {

	public static void main(String[] args) {

		double[] arrA = new double[100];
		Random rand = new Random();

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = rand.nextDouble();
		}

		System.out.println("Ish massiv:\t\t");
		for (int i = 0; i < arrA.length; i++) {
			System.out.printf("%3f ", arrA[i]);
		}
		System.out.println();

		boolean sort = false;
		double temp;
		while (!sort) {
			sort = true;
			for (int i = 0; i < arrA.length - 1; i++) {
				if (arrA[i] < arrA[i + 1]) {
					temp = arrA[i];
					arrA[i] = arrA[i + 1];
					arrA[i + 1] = temp;
					sort = false;
				}
			}
		}

		System.out.println("Sort massiv:\t\t");
		for (int i = 0; i < arrA.length; i++) {
			System.out.printf("%3f ", arrA[i]);
			

		}

	}

}
