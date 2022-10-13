package lt.lhu.unit07.main;
/*
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов
 */

public class Task02 {

	public static void main(String[] args) {

		int[] arr = new int[] { 57, 0, 16, 87, 0, 25, 74, 0 };

		int count0 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0++;
			}
		}

		int[] zeroArr = new int[count0];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroArr[j++] = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("|%d|", arr[i]);
		}

		System.out.println("\n");
		for (int i = 0; i < zeroArr.length; i++) {
			System.out.printf("[%d]", zeroArr[i]);
		}

	}

}
