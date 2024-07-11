package algoritimo;

public class Selection {
	public static void SelectionSort(int[] v) {
		int x = v.length;
		boolean c;
		for (int z = 0; z < x - 1; z++) {
			c=true;
			int minIndex = z;
			for (int t = z + 1; t < x; t++) {
				if (v[t] < v[minIndex]) {
					minIndex = t;
					c=false;
				}
				if(c) {
					break;
				}
			}
			int temp = v[minIndex];
			v[minIndex] = v[z];
			v[z] = temp;
		}

	}
}
