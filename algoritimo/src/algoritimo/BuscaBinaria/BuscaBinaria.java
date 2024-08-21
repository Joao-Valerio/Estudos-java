package algoritimo;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Qual número voce busca?");
		int b = t.nextInt();
		int r = Busca(v, b);
		if (r == -1) {
			System.out.println("O elemento nao existe");
		} else {
			System.out.println("Elemento encontrado no índice " + r);
		}
	}

	public static int Busca(int[] v, int b) {
		int inicio = 0;
		int fim = v.length - 1;
		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			if (v[meio] == b) {
				return meio;
			} else if (v[meio] < b) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}
}
