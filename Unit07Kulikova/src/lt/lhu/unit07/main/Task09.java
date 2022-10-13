package lt.lhu.unit07.main;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

import java.util.Scanner;
import java.util.Random;

public class Task09 {

	public static void main(String[] args) {

		int n = inputNum("Vvedite razmer massiva >");
		double[] arr = new double[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble(10);
		}

		double min = arr[0];
		double max = arr[0];
		int nmin = 0;
		int nmax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				nmax = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
				nmin = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + ";\n");
		}

		double temp = arr[nmin];

		arr[nmin] = arr[nmax];
		arr[nmax] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + ";\n");
		}

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
