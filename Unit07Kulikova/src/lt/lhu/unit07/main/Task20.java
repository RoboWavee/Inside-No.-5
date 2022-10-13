package lt.lhu.unit07.main;
/*
 *  * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */

import java.util.Scanner;
import java.util.Random;

public class Task20 {

	public static void main(String[] args) {

		int n = inputNum("Vvedite razmer massiva >");
		int[] arr = new int[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
		}
		System.out.println("");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
		}
		
		moveZero(arr);
		
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
		}

	}
	
	public static int[] moveZero(int[] num) {
		int count = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == 0) {
				count++;
			} else if (count != 0) {
				num[i - count] = num[i];
				num[i] = 0;
			}
		}
		return num;
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
