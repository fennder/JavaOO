package atividades.unidade5;

public interface Veiculo {
	
	void acelerar(int velocidade);
	void frear();
	
	default int getVelocidadeAtual()
	{
		return 0;
	}
	
	static boolean estaEmMovimento(int velocidade)
	{
		mensagem();
		return velocidade > 0;
	}
	/*
	 * Undade 3 -> Métodos Privados -> Slide 45
	 */
	private static void mensagem()
	{
		System.out.println("Se estiver em moviment, retorna true;caso contrário, retorna false");
	}

}
