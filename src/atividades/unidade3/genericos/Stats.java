package atividades.unidade3.genericos;

public class Stats<T extends Number> {
	T[] num;

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	public double media() {
		if (num == null || num.length == 0) {
			throw new IllegalArgumentException("Array is empty ou not initialized.");
		}
		
		double soma = 0;
		for (T value : num) {
			soma = value.doubleValue();
		}
		return (soma/num.length);
	}

}
