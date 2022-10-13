package lt.lhu.unit07.main;
/*
 * Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
промежутке от L до N.
 */

import java.util.Scanner;
import java.util.Random;

public class Task13 {

	public static void main(String[] args) {

		int a = inputNum("Vvedite razmer massiva > ");
		int[] arr = new int[a];
		Random rand = new Random();

		int m = rand.nextInt(7) + 2; // kratn
		int l = inputNum("Vvedite nachalo otrezka >");
		int n = inputNum("Vvedite konec otrezka >");
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			if ((arr[i] % m == 0) && arr[i] >= l && arr[i] <= n) {
				count++;
			}
		}

		System.out.println(
				"Количество элементов кратных " + m + " в промежутке между " + l + " и " + n + " равно = " + count);

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
