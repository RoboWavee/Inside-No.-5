package lt.lhu.unit07.main;
/*
 * Даны натуральные числа а1 ,а2 ,..., аn . 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

import java.util.Scanner;
import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int n = inputNum("Введите размер массива >");
		int[] arr = new int[n];
		Random rand = new Random();

		int m = rand.nextInt(9) + 1;
		int l = rand.nextInt(8) + 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(1000);
			if (arr[i] % m == l) {
				System.out.println(
						m + " delitel. " + "Ostatok chisla " + arr[i] + " ot delenija na " + m + " raven " + l);

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
