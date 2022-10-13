package lt.lhu.unit07.main;

import java.util.Scanner;
import java.util.Random;

public class Task16 {

	public static void main(String[] args) {

		int n = inputEvenNum("vvedite chetnoe chislo >");

		while (n % 2 != 0) {
			n = inputEvenNum("vvedite chetnoe chislo >");
		}

		double[] arr = new double[n];
		Random rand = new Random();

		double maxsum = arr[0] + arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble();
			for (int j = 1; j < arr.length / 2; j++) {
				if ((arr[j] + arr[arr.length - j - 1]) > maxsum) {
					maxsum = (arr[j] + arr[arr.length - j - 1]);
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i] + "; ");
		}

		System.out.println("Maximalnaja summa = " + maxsum);

	}

	public static int inputEvenNum(String message) {

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
