package algoritimo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class g {

	public static void main(String[] args) {

		// João Valério Santana e Jair Augusto

		Scanner t = new Scanner(System.in);

		int vetor[] = new int[10];

		int inicio = 0, termino = 0;

		while (true) {

			System.out.println("       Menu de opções");

			System.out.println("");

			System.out.println("1ª opção: coletar dados do Vetor.");

			System.out.println("2ª opção: randomizar os valores do Vetor.");

			System.out.println("3ª opção: imprime dados do Vetor.");

			System.out.println("4ª opção: imprime Vetor invertido.");

			System.out.println("5ª opção: soma valores do Vetor");

			System.out.println("6ª opção: Soma personalizada dos valores do Vetor.");

			System.out.println("7ª opção: Media dos valores do Vetor.");

			System.out.println("8ª opção: Maior valor dentro do Vetor.");

			System.out.println("9ª opção: Menor valor dentro do Vetor.");

			System.out.println("10ª opção: Para Organizar de forma Crescente");

			System.out.println("11ª opção: Buscar valor específico no vetor");
			System.out.println("");
			System.out.println("Digite 0 para sair.");

			System.out.println("Digite a opção desejada:");

			int escolha = t.nextInt();

			switch (escolha) {

			case 1:

				coletaVetor(vetor);

				break;

			case 2:

				int max = max();

				gerarVetorRandomico(vetor, max);

				break;

			case 3:

				imprimeVetor(vetor);

				break;

			case 4:

				imprimeVetorInvertido(vetor);

				break;

			case 5:

				somaTodos(vetor);

				break;

			case 6:

				somaPersonalizada(vetor, inicio, termino);

				break;

			case 7:

				media(vetor);

				break;

			case 8:

				maiorValor(vetor);

				break;

			case 9:

				menorValor(vetor);

				break;

			case 10:

				orgCrescente(vetor);

				break;

			case 11:

				buscaEspec(vetor);

				break;

			case 0:

				System.out.println("Fim do algoritimo");

				return;

			default:

				System.out.println("Opção inválida");

				break;

			}

		}

	}

	public static int[] coletaVetor(int[] vetor) {

		Scanner t = new Scanner(System.in);

		for (int cont = 0; cont < 10; cont++) {

			System.out.println("Informe o " + (cont + 1) + "º Valor do Vetor");

			vetor[cont] = t.nextInt();

		}

		return vetor;

	}

	public static int[] gerarVetorRandomico(int[] vetor, int max) {

		Random ale = new Random();

		System.out.print("Valores randômicos gerados: ");

		for (int x = 0; x < 10; x++) {

			vetor[x] = ale.nextInt(max);

			if (x < vetor.length - 1) {

				System.out.print(vetor[x] + ",");

			} else {

				System.out.println(vetor[x]);

				System.out.println(" ");

			}

		}

		return vetor;

	}

	public static int max() {

		Scanner t = new Scanner(System.in);

		System.out.println("Qual o valor Máximo para os valores do Vetor");

		int max = t.nextInt();

		return max;

	}

	public static void imprimeVetor(int[] vetor) {

		System.out.println("Dados do vetor: ");

		for (int x = 0; x < 10; x++) {

			if (x < vetor.length - 1) {

				System.out.print(vetor[x] + ",");

			} else {

				System.out.println(vetor[x]);

				System.out.println(" ");

			}

		}

	}

	public static void imprimeVetorInvertido(int[] vetor) {

		System.out.print("Dados do Vetor: ");

		for (int x = 1; x <= vetor.length; x++) {

			if (x <= vetor.length - 1) {

				System.out.print(vetor[vetor.length - x] + ",");

			} else {

				System.out.print(vetor[vetor.length - x]);

				System.out.println(" ");

			}

		}

	}

	public static int somaTodos(int[] vetor) {

		int soma = 0;

		for (int x = 0; x < vetor.length; x++) {

			soma = vetor[x] + soma;

		}

		System.out.println("Soma de todos os valores do vetor: " + soma);

		System.out.println(" ");

		return soma;

	}

	public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

		Scanner t = new Scanner(System.in);

		int soma = 0;

		System.out.println("Indíce de início(inclusive):");

		inicio = t.nextInt();

		System.out.println("Indíce de término(inclusive):");

		termino = t.nextInt();

		if (inicio <= vetor.length && termino <= vetor.length) {

			if (inicio < termino) {

				for (int x = inicio; x <= termino; x++) {

					soma = soma + vetor[x];

				}

				System.out.println("Soma personalizada: " + soma);

				System.out.println("  ");

			} else {

				System.out.println("Verifique restrições do Algoritimo!");

				System.out.println("  ");

			}

		} else {

			System.out.println("Verifique restrições do Algoritimo!");

			System.out.println(" ");

		}

		return soma;

	}

	public static double media(int[] vetor) {

		double soma = 0;

		for (int x = 0; x < vetor.length; x++) {

			soma = vetor[x] + soma;

		}

		double media = soma / 10;

		System.out.println("A média do Vetor é " + media);

		System.out.println(" ");

		return soma;

	}

	public static int menorValor(int[] vetor) {

		int menor = vetor[0];

		for (int x = 0; x < vetor.length; x++) {

			if (menor > vetor[x]) {

				menor = vetor[x];

			}

		}

		System.out.println("O menor valor do Vetor é: " + menor);

		System.out.println(" ");

		return menor;

	}

	public static int maiorValor(int[] vetor) {

		int maior = vetor[0];

		for (int x = 0; x < vetor.length; x++) {

			if (maior < vetor[x]) {

				maior = vetor[x];

			}

		}

		System.out.println("O maior valor do Vetor é: " + maior);

		System.out.println("  ");

		return maior;

	}

	public static int[] orgCrescente(int[] vetor) {

		Arrays.sort(vetor);

		System.out.println("Vetor Organizado");

		for (int x = 0; x < vetor.length; x++) {
			if (x < vetor.length - 1) {

				System.out.print(vetor[x] + ",");

			} else {

				System.out.println(vetor[x]);

				System.out.println(" ");

			}

		}

		return vetor;

	}

	public static void buscaEspec(int[] vetor) {

		Scanner t = new Scanner(System.in);
		System.out.println("Voce deseja ordenar o vetor para a busca ou não?");
		String ordenar = t.nextLine();
		if (ordenar.equalsIgnoreCase("ordenar")) {
			Arrays.sort(vetor);

			System.out.println("Qual número você deseja achar?");

			int busca = t.nextInt();

			int inicio = 0;

			int fim = vetor.length - 1;

			boolean encontrado = false;

			while (inicio <= fim) {

				int meio = inicio + (fim - inicio) / 2;

				if (vetor[meio] == busca) {

					System.out.println("Valor encontrado no índice: " + meio);

					encontrado = true;

					break;
				}

				else if (vetor[meio] < busca) {

					inicio = meio + 1;

				} else {

					fim = meio - 1;

				}

			}

			if (!encontrado) {

				System.out.println("Valor não encontrado no vetor.");

			}

			System.out.println(" ");

		} else {
			System.out.println("Qual número você deseja achar?");
			int busca = t.nextInt();
			boolean encontrado = false;

			for (int c = 0; c < vetor.length; c++) {
				if (vetor[c] == busca) {
					System.out.println("Valor encontrado no índice: " + c);
					encontrado = true;
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Valor não encontrado no vetor.");
			}

			System.out.println(" ");

		}
	}
}
