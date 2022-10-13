package lt.lhu.unit07.main;

import java.util.Scanner;
import java.util.Random;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task08 {

	public static void main(String[] args) {

		int n = inputNum("Размер массива >");
		int[] arrMass = new int[n];
		Random rand = new Random();
		int countOtr = 0;
		int countPol = 0;
		int count0 = 0;

		for (int i = 0; i < arrMass.length; i++) {
			arrMass[i] = rand.nextInt(100) - 50;
			if (arrMass[i] > 0) {
				countPol++;
			}
			if (arrMass[i] == 0) {
				count0++;
			}
			if (arrMass[i] < 0) {
				countOtr++;
			}
		}
		
		System.out.println("Количество положительных чисел +: " + countPol + "\n" 
		+ "Количество отрицательных чисел -: " + countOtr + "\n" 
		+ "Количество нулей 0: " + count0);

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
