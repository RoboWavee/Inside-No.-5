package lt.lhu.unit07.main;
/*
 * Дана последовательность чисел а1 ,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую все эти числа
 */

import java.util.Scanner;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {

		int n = inputNum("Размер массива >");
		int[] arrA = new int[n];
		Random rand = new Random();
		int min = 0;
		int max = 0;

		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = rand.nextInt(100);

		}

		min = arrA[0];
		max = arrA[0];

		for (int i = 1; i < arrA.length; i++) {
			if (arrA[i] < min) {
				min = arrA[i];
			} else {
				if (arrA[i] > max) {
					max = arrA[i];
				}

			}
		}

		int otr = 0;
		otr = max - min;

		System.out.println(otr);

		for (int i = 0; i < arrA.length; i++) {
			System.out.print("arr[" + i + "]=" + arrA[i] + "; ");
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
