package lt.lhu.unit07.main;
/*
 * Дан одномерный массив A[N]. Найти:),,,min(),,,max
 
 */

import java.util.Scanner;
import java.util.Random;

public class Task14 {

	public static void main(String[] args) {

		int n = inputNum("Razmer massiva >");
		int[] arr = new int[n];
		Random rand = new Random();

		int max = arr[0];

		for (int i = 0; i < arr.length; i = i + 2) {
			arr[i] = rand.nextInt(100) + 1;
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i = i + 2) {
			arr[i] = rand.nextInt(100) + 1;
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int sum = max + min;

		System.out.println("Сумма максимального элемента " + max + " среди элементов с четным индексом и минимального "
				+ min + " среди элементов с нечетным индексом равна =" + sum);

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
