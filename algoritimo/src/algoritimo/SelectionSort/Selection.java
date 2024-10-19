package algoritimo;

public class Selection {
	public static void SelectionSort(int[] v) {
		int x = v.length;

		for (int z = 0; z < x - 1; z++) {
			int minIndex = z;
			for (int t = z + 1; t < x; t++) {
				if (v[t] < v[minIndex]) {
					minIndex = t;

				}

			}
			int temp = v[minIndex];
			v[minIndex] = v[z];
			v[z] = temp;
		}

	}
}
