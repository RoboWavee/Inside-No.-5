package lt.lhu.unit07.main;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
import java.util.Scanner;
import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		int n = inputNum("Введите размер массива >");
		int[] arr = new int[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(20);
			if (arr[i] > i) {
				System.out.println(arr[i]);
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
