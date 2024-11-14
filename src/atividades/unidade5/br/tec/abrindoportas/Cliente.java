package atividades.unidade5.br.tec.abrindoportas;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	
	String cpf;
	String name;
	String email;
	
	public Cliente(String cpf, String name, String email) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	Set<Curso> lcursos;
	public Set<Curso> getLcursos() {
		return lcursos;
	}

	public void setLcursos(Set<Curso> lcursos) {
		this.lcursos = lcursos;
	}

	public static void main(String[] args) {
		
		Curso java8 = new Curso("Java8");
		Curso oracle12c = new Curso("oracle12c");
		Curso infraEs = new Curso("infraEs");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();

		Cliente A = new Cliente();
		A.setLcursos(cursosA);
		Cliente B = new Cliente();
		B.setLcursos(cursosB);

		cursosA.add(java8);
		cursosA.add(oracle12c);
		cursosB.add(java8);
		cursosB.add(oracle12c);
		cursosB.add(infraEs);

		System.out.println(cursosA.toString());
		System.out.println(cursosB.toString());
		
		// interseção
		cursosA.retainAll(cursosB);
		System.out.println("A interseção de A e B é " + cursosA + "1º Teste");
		cursosA.removeAll(cursosB);
		System.out.println("Cursos que A faz menos B " + cursosA + "2º Teste");
		// B
		// interseção
		cursosB.retainAll(cursosA);
		System.out.println("A interseção de A e B é " + cursosB + "3º Teste");
		cursosB.removeAll(cursosA);
		System.out.println("Cursos que B faz menos A " + cursosB + "4º Teste");
		
	}*/

}
