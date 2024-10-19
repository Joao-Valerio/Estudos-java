package algoritimo;

import java.util.Scanner;

public class Mostrar {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] v = new int[10];
		for (int c = 0; c < v.length; c++) {
			System.out.println("Informe o " + (c + 1) + "º Valor do Vetor");
			v[c] = t.nextInt();
		}
		Selection.SelectionSort(v);
		System.out.println("Vetor ordenado:");
		for (int num : v) {
			System.out.print(num + " ");
		}
	}
}
