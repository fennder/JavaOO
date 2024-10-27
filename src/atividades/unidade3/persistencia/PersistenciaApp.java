package atividades.unidade3.persistencia;

import atividades.unidade1.rh.Administrativo;
import atividades.unidade1.rh.Diretor;

public class PersistenciaApp {
	
	public static void main(String[] args) {		
		GenericDAO<Administrativo> admin = new GenericDAO<>();
		admin.create(new Administrativo());
		
		GenericDAO<Diretor> diretor = new GenericDAO<>();
		diretor.create(new Diretor());
	}
	
}
