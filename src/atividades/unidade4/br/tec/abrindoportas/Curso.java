package atividades.unidade4.br.tec.abrindoportas;

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
	public int getCdCurso() {
		return cdCurso;
	}
	public void setCdCurso(int cdCurso) {
		this.cdCurso = cdCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Path getUrl() {
		return url;
	}
	public void setUrl(Path url) {
		this.url = url;
	}

	
}
