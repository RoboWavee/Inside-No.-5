package lt.lhu.unit07.main;

import java.util.Scanner;

/*
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */
import java.util.Scanner;
import java.util.Random;

public class Task04 {

	public static void main(String[] args) {

		int n = inputNum("Ввведите размер массива");
		double[] arrA = new double[n];
		Random rand = new Random();
		double min;

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = rand.nextDouble();
		}

		min = arrA[0];

		for (int i = 1; i < arrA.length; i++) {
			if (arrA[i] > min) {
				min = arrA[i];
			} else {
				System.out.println("Последовательность чисел не возрастающая -");
				break;
			}
			System.out.println("Последовательность чисел возастающая +");

		}

		for (int i = 0; i < arrA.length; i++) {
			System.out.println("arr[" + i + "]=" + arrA[i] + "; ");
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
