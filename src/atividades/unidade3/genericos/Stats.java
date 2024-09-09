package atividades.unidade3.genericos;

public class Stats<T extends Number> {
	T[] num;

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	double media() {
		int i = 0;
		double soma = 0;
		for (int j = 0; j < num.length; j++) {
			soma = soma + num[j].doubleValue();
		}
		return (soma/i);
	}

}
