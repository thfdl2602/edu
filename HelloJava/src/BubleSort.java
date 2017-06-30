
public class BubleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 345, 23, 563, 56, 2 };

		BubleSort.bubleSort(array);
	}

	public static void bubleSort(int[] array) {
		int temp = 0;
		int i, j = 0;
		for (j = 0; j < array.length - 1; j++) {
			for (i = 0; i < array.length - 1 - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

		}
		for (int z = 0; z < array.length; z++)
			System.out.println(array[z]);
	}
}
