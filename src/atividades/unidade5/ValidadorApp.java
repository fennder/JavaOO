package atividades.unidade5;

public class ValidadorApp {

	public static void main(String[] args) {
		
		String celular = "99113-4566";
		String email = "fennder@gmail.com";
		
		Validador<String> validacao = valor->valor.matches("[0-9]{5}-[0-9]{4}");
		System.out.println("Validando telefone: " + (validacao.valida(celular) == true?"Verdadeiro":"Falso"));
		
		Validador<String> validaEmail = valor->valor.matches(email);
		System.out.println("Validando email: " + (validaEmail.valida(email) == true?"Verdadeiro":"Falso"));

	}

}
