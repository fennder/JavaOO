package br.tec.abrindoportas;

import javax.swing.JOptionPane;

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

		ServidorPublicoController spc = new ServidorPublicoController();
		spc.adicionarServidorPublico();
		spc.adicionarServidorPublico();
		System.out.println( "02 Servidores ");
		spc.listarServidorPublico();

		CursoController cc = new CursoController();
		cc.adicionarCurso();
		cc.listarCursos();
		cc.listarCurso(1);
		cc.deletarCurso(2);
		CursoModel cursoModelUpdate = new CursoModel(2, "Java Básico", "Licitação", "ENAP", 57.59);
		cc.alterarCurso(cursoModelUpdate);
		cc.listarCursos();

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

		// EstatutarioModel estatutarioModel = new EstatutarioModel(2, 0, 0, "Edir Pereira dos Snatos", "Técnico em Informática", 4500, "fennder@gmail.com");
		// estatutarioModel.setTempoServico(2);
		// estatutarioModel.setSalarioBase(45877);
		// estatutarioModel.setName("Edir Pereira dos Santos");
		// System.out.println(estatutarioModel);

		// ComissionadoModel comissionadoModel = new ComissionadoModel(564, 9500, 85,"Edir Pereira dos Santos", "Analista técnico", 5222, "edir.pereira@gmail.com");
		// comissionadoModel.imprimeDados();

		// TemporarioModel temporarioModel = new TemporarioModel("2 anos", 4586, 25, "Vicente Lima Frasão", "Analista em TI", "vicente.frasao@gmail.com");
		// System.out.println(temporarioModel.getMatricula());
		// System.out.println(temporarioModel.getName());
		// System.out.println(temporarioModel.calcularSalarioHorasExras(20,52,89));
		// System.out.println(temporarioModel.calcularSalarioHorasExras(20));
		
		// ServidorPublicoModel servidorPublicoModel = new ComissionadoModel(564, 5000, 85, "Edir Pereira dos Santos", "Analista de TI", 4500, "edir.teste@gmail.com");
		// servidorPublicoModel = new EstatutarioModel(0, 3500, 23, "Edir Pereira", "Analista de Teste", 6500, "edi@gmail.com");

		// System.out.println(servidorPublicoModel);
		// System.out.println(	((EstatutarioModel)servidorPublicoModel).getTempoServico());
		// System.out.println(	((EstatutarioModel)servidorPublicoModel).getSalarioBase());
		// servidorPublicoModel.exibirInformacoes();

		// ServidorPublicoController servidorPublicoController = new ServidorPublicoController();
		// servidorPublicoController.verificaTipoServidorPublico(servidorPublicoModel);
	}

}
