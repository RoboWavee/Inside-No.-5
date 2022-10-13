package lt.lhu.unit07.main;

/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
import java.util.Scanner;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

		int n = inputNum("Размер массива");
		int[] massA = new int[n];
		Random rand = new Random();
		int k = rand.nextInt(10);
		int sum = 0;

		for (int i = 0; i < massA.length; i++) {
			massA[i] = rand.nextInt(100);
			if (massA[i] % k == 0) {
				sum = sum + massA[i];
			}

		}

		for (int i = 0; i < massA.length; i++) {
			System.out.println("arr[" + i + "]=" + massA[i] + "; ");
		}

		System.out.println("Сумма элементов, кратных " + k + " равна: " + sum);

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
