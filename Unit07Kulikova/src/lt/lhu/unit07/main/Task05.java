package lt.lhu.unit07.main;

/*
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте
 */
import java.util.Scanner;
import java.util.Random;

public class Task05 {

	public static void main(String[] args) {

		int n = inputNum("Длина массива >");
		int[] arr = new int[n];
		Random rand = new Random();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			if (arr[i] % 2 == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Четных чисел нет");
		}

		else {

			int[] arrEven = new int[count];

			for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					arrEven[j] = arr[i];
					j++;
				}

			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print("arr[" + i + "]=" + arr[i] + "; ");
			}
			System.out.println();

			for (int i = 0; i < arrEven.length; i++) {
				System.out.print("arr[" + i + "]=" + arrEven[i] + "; ");
			}

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
