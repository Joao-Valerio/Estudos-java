package algoritimo;

import java.util.HashSet;
import java.util.Set;

public class OperacoesConj {
	public static Set<Integer> uniao(Set<Integer> conj1, Set<Integer> conj2) {
		Set<Integer> u = new HashSet<>(conj1);
		u.addAll(conj2);
		return u;
	}

	public static Set<Integer> intersecao(Set<Integer> conj1, Set<Integer> conj2) {
		Set<Integer> i = new HashSet<>(conj1);
		i.retainAll(conj2);
		return i;
	}

	public static Set<Integer> difereca(Set<Integer> conj1, Set<Integer> conj2) {
		Set<Integer> d = new HashSet<>(conj1);
		d.removeAll(conj2);
		return d;
	}
}
