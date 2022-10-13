package lt.lhu.unit07.main;
/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.
 */

import java.util.Scanner;
import java.util.Random;

public class Task07 {

	public static void main(String[] args) {

		int n = inputNum("Размер массива >");
		int[] arrA = new int[n];
		Random rand = new Random();
		int z = inputNum("Введите число >");

		int countZ = 0;

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = rand.nextInt(100);
			if (arrA[i] > z) {
				arrA[i] = z;
				countZ++;
			}

		}

		System.out.println(countZ);

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
