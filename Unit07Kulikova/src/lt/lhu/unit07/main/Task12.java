package lt.lhu.unit07.main;
/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		порядковые номера которых являются простыми числами.
 */

import java.util.Scanner;
import java.util.Random;

public class Task12 {

	public static void main(String[] args) {

		int n = inputNum("Vvedite razmer massiva > ");
		double[] arr = new double[n];
		Random rand = new Random();
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble();

			if (findPrimeNum(i)) {

				sum = sum + arr[i];

			}
			System.out.println(sum);
		}
	}


	public static boolean findPrimeNum(int x) {
		if (x < 2)
			return false;
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	public static int inputNum(String message) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы не ввели число\n> " + message);
		}
		num = sc.nextInt();

		return num;
	}

}