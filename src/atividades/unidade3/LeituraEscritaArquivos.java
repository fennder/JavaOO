package atividades.unidade3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LeituraEscritaArquivos {

	public static void main(String[] args) {
		exemplo01();
//		exemplo02();
	}

	private static void exemplo02() {
		try{
			String  novoFuncionario = """
					,{
						"nome": "Vicente Lima Pereira Santos Frasão",
						"idade": 4,
						"cargo": "Empresário",
						"departamento": "Vestimento",
						"salario": 10500.00,
						"endereco": {
							"quadra": 1005,
							"alameda": 13,
							"complemento": "QI 7",
							"bairro": "Plano Diretor Sul",
							"cidade": "Palmas",
							"uf": "Tocantins",
							"cep": "77018-488"
						}
					}
					""";
			Files.writeString(Path.of("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/file/funcionarios.json"), novoFuncionario, StandardOpenOption.APPEND);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void exemplo01() {
		try {
			String texto = Files.readString(Path.of("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/file/funcionarios.json"));
			System.out.println(texto);
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	

}
