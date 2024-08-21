package algoritimo;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		Set<Integer> conj1 = new HashSet<>();
		conj1.add(1);
		conj1.add(3);
		conj1.add(5);
		conj1.add(7);
		conj1.add(9);

		Set<Integer> conj2 = new HashSet<>();
		conj2.add(1);
		conj2.add(2);
		conj2.add(3);
		conj2.add(4);
		conj2.add(5);

		System.out.println("Conjunto numero 1: " + conj1);
		System.out.println("Conjunto numero 2: " + conj2);

		Set<Integer> uniao = OperacoesConj.uniao(conj1, conj2);
		System.out.println("Uniao entre os conjuntos: " + uniao);

		Set<Integer> intersecao = OperacoesConj.intersecao(conj1, conj2);
		System.out.println("Intersecao entre os conjuntos: " + intersecao);

		Set<Integer> diferenca = OperacoesConj.difereca(conj1, conj2);
		System.out.println("Diferenca entre os conjuntos: " + diferenca);
	}

}
