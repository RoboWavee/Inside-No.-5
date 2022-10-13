package lt.lhu.unit07.main;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
несколько, то определить наименьшее из них.
 */
import java.util.Scanner;
import java.util.Random;

public class Task19 {

	public static void main(String[] args) {

		int n = inputNum("Vvedite razmer massiva >");
		int[] arr = new int[n];
		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}
		System.out.print("Massiv1:\t\t ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
		}
		System.out.println("");

		massivPoUbyvaniju(arr);

		System.out.print("Massiv2:\t\t ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d ", arr[i]);
		}
		System.out.println("");
		
		popularNum(arr);
		System.out.println(popularNum(arr));

	}

	public static int popularNum(int[] n) {

		int count1 = 1;
		int count2 = 0;
		int pupular1 = 0;
		int popular2 = 0;

		for (int i = 0; i < n.length; i++) {
			pupular1 = n[i];
			count1 = 0; 

			for (int j = i + 1; j < n.length; j++) {
				if (pupular1 == n[j])
					count1++;
			}

			if (count1 > count2) {
				popular2 = pupular1;
				count2 = count1;
			}

			else if (count1 == count2) {
				popular2 = Math.min(popular2, pupular1);
			}
		}
		return popular2;
	}

	public static int[] massivPoUbyvaniju(int[] num) {

		int temp;
		int max;
		for (int i = 0; i < num.length; i++) {
			max = i;

			for (int j = i + 1; j < num.length; j++) {
				if (num[j] > num[max]) {
					max = j;
				}
			}
			temp = num[i];
			num[i] = num[max];
			num[max] = temp;
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
