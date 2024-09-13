package atividades.unidade3.genericos;

public class NotaAluno {
	double valor;
	<T extends Number>NotaAluno(T obj) {
		valor = obj.doubleValue();
	}
	
	<T extends Number>double retornarValor(T obj) {
		return obj.doubleValue();
	}
}
