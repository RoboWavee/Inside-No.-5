package lt.lhu.unit07.main;
/*
 * Дана последовательность действительных чисел n. Указать те ее элементы, которые принадлежат отрезку
[с, d].
 */

import java.util.Scanner;
import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		int n = inputNum("Vvedite razmer massiva > ");
		double[] arr = new double[n];
		Random rand = new Random();
		
		double c = inputNum("Vvedite nachalo otrezka > ");
		double d = inputNum("Vvedite konec otrezka > ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() * 100 + rand.nextInt(10);
			if (arr[i] >= c && arr[i] <= d) {
				System.out.println("Элемент " + arr[i] + " принадлежит отрезку [c,d]" + c + " - " + d);
			}
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
