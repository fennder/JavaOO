package br.tec.abrindoportas;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.controller.CursoController;
import br.tec.abrindoportas.controller.ServidorPublicoController;
import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.model.DependenteModel;
import br.tec.abrindoportas.model.ServidorPublicoModel;
import br.tec.abrindoportas.model.TelefoneModel;
import br.tec.abrindoportas.model.subclass.EstatutarioModel;

/*
 * Classe principal para Java Orientado a Objetos
 */
public class Principal {

	public static void main(String[] args) {

		// ServidorPublicoController spc = new ServidorPublicoController();
		// spc.adicionarServidorPublico();
		// // spc.adicionarServidorPublico();
		// spc.listarServidorPublico(1234);
		// spc.deletarServidorPublico(5679);
		// ServidorPublico servidorPublicoUpdate = new ServidorPublico(5678, "Vicente Santos Frasão", "Analista", null, null, 7500.0, 0, 0, null, null, null, null, null, null, null, null);
		// spc.alterarServidorPublico(servidorPublicoUpdate);
		// spc.listarServidorPublico();
		// spc.calcularFolhaServidoresPublicos();

		// CursoController cc = new CursoController();
		// cc.adicionarCurso();
		// cc.listarCursos();
		// cc.listarCurso(1);
		// cc.excluirCurso(2);
		// CursoModel cursoModelUpdate = new CursoModel(2, "Java Básico", "Licitação", "ENAP", 57.59);
		// cc.alterarCurso(cursoModelUpdate);
		// cc.listarCursos();

		// ServidorPublicoModel servidorPublicoModel = new ServidorPublicoModel(1, "Edir", null, null, "Servidor", 4500, 0, 0, null, "Brasília", null, "fennder@gmail.com", null, null);
		
		// CursoModel cursoModel = new CursoModel(1, "Curso Java", "Presencial", "ENAP", 57.59);
		// servidorPublicoModel.setCursos(cursoModel);
		// servidorPublicoModel.getCursos();
				
		// TelefoneModel telefoneModel = new TelefoneModel("Pessoal", "61 98406-7817");
		// servidorPublicoModel.setTelefones(telefoneModel);
		// servidorPublicoModel.getTelefones();
		
		// DependenteModel dependenteModel = new DependenteModel("Vicente Frasão", "108.456.789-89", "Masculino", 4);
		// servidorPublicoModel.setDependentes(dependenteModel);
		// servidorPublicoModel.getDependentes();

		EstatutarioModel estatutarioModel = new EstatutarioModel(2, 0, 0, "Edir Pereira dos Snatos", 4500, "fennder@gmail.com");
		estatutarioModel.setTempoServico(2);
		estatutarioModel.setSalarioBase(45877);
		estatutarioModel.setName("Edir Pereira dos Santos");
		System.out.println(estatutarioModel);
	}

}
