package lt.lhu.unit07.main;

/*
 * 
 * Дана последовательность целых чиселnaaa ,,, 21  . Образовать новую последовательность, выбросив из исходной
те члены, которые равны),,,min( 21 naaa  .
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Task17 {

	public static void main(String[] args) {

		int n = inputNum("Razmer massiva >");
		int[] arr1 = new int[n];
		Random rand = new Random();

		int min = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt(20) - 10;
		}

		for (int temp : arr1) {
			min = Math.min(min, temp);
		}
		for (int temp : arr1) {
			if (temp == min) {
				count++;
			}
		}

		int[] arr2 = new int[n - count];

		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != min) {
				arr2[i] = arr1[i];
			}

		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr1[" + i + "]=" + arr1[i] + "; ");
			
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("arr2[" + i + "]=" + arr2[i] + "; ");
		}
		System.out.println();
		System.out.println(min + " " + count);

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
