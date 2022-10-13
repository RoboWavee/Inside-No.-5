package lt.lhu.unit07.main;
/*
 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
отрицательное
 */

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		int n = inputNum("Введите количество элементов массива");
		int[] arr = new int[n];
		Random rand = new Random();
		Random rand2 = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt() - rand2.nextInt();
		}

		if (arr[0] < 0) {
			System.out.println("Отрицательное (-) число встречается раньше");
		} else {
			System.out.println("Положительное (+) число встречается раньше");
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i] + "; ");
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
