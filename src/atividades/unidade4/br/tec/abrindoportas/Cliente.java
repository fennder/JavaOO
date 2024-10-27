package atividades.unidade4.br.tec.abrindoportas;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	Set<Curso> lcursos;
	
	public Set<Curso> getLcursos() {
		return lcursos;
	}


	public void setLcursos(Set<Curso> lcursos) {
		this.lcursos = lcursos;
	}


	public static void main(String[] args) {
		
		Curso java8 = new Curso("Java8");
		Curso oracle12c = new Curso("oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();

		Cliente A = new Cliente();
		Cliente B = new Cliente();

		A.setLcursos(cursosA);
		B.setLcursos(cursosB);
		
		System.out.println(A.toString());
		System.out.println(B.toString());
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
		cursosB.add(java8);
		
		// interseção
		cursosA.retainAll(cursosB);
		System.out.println("A interseção de A e B é " + cursosA);
		cursosA.removeAll(cursosB);
		System.out.println("Cursos que B faz menos A " + cursosA);
		
		
	}

}
