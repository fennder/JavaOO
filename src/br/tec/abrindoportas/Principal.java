package br.tec.abrindoportas;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.controller.App;
import br.tec.abrindoportas.controller.CursoController;
import br.tec.abrindoportas.controller.ServidorPublicoController;
import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.model.DependenteModel;
import br.tec.abrindoportas.model.ServidorPublicoModel;
import br.tec.abrindoportas.model.TelefoneModel;
import br.tec.abrindoportas.model.subclass.ComissionadoModel;
import br.tec.abrindoportas.model.subclass.EstatutarioModel;
import br.tec.abrindoportas.model.subclass.TemporarioModel;

/*
 * Classe principal para Java Orientado a Objetos
 */
public class Principal {

	public static void main(String[] args) {

		App aplicacao = new App();
		aplicacao.adicionarServidorPublico();
		aplicacao.adicionarServidorPublico();
		System.out.println(" 02 Servidores Cadastrados ");
		aplicacao.listarServidoresPublicos();

		aplicacao.adicionarCurso();
		aplicacao.adicionarCurso();
		System.out.println(" 02 Cursos Cadastrados");
		aplicacao.listarCursos();

		aplicacao.adicionarCursoServidorPublico(1, 10);
		aplicacao.adicionarCursoServidorPublico(1, 20);
		aplicacao.adicionarCursoServidorPublico(2, 10);
		aplicacao.adicionarCursoServidorPublico(2, 20);

		System.out.println(" Listagem de Cursos ");
		aplicacao.listarCursosServidorPublico(1);
		aplicacao.listarCursosServidorPublico(2);
		
		System.out.println(" Listagem de Servidore ");
		aplicacao.adicionarServidorCurso(10, 1);
		aplicacao.adicionarServidorCurso(20, 1);
		
	}

}
