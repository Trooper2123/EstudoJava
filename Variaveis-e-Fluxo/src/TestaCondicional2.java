public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 3;
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("infelizmente voce nao pode logar");
		}
	}
}