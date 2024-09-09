package atividades.unidade3.genericos;

public class UsoGenerico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser<String, String> iob = new LoginUser<>("Edir","Codkeysenh@01");
		
		iob.showType();
	}

}
