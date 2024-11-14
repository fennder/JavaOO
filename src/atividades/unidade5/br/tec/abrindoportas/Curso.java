package atividades.unidade5.br.tec.abrindoportas;

import java.nio.file.Path;

public class Curso {
	
	int cdCurso;
	String nome;
	double valor;
	Path url;
	
	public Curso(int cdCurso, String nome, double valor, Path url) {
		super();
		this.cdCurso = cdCurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}

}
